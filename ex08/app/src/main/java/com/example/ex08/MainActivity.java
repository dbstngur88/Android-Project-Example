package com.example.ex08;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.textbox);
        findViewById(R.id.btn01).setOnLongClickListener(mLong);
        findViewById(R.id.btn02).setOnLongClickListener(mLong);
        findViewById(R.id.btn03).setOnLongClickListener(mLong);
    }

    public void mClick(View view) {
        switch (view.getId()){
            case R.id.btn01 :
                text.setTextColor(Color.WHITE);
                text.setBackgroundColor(Color.RED);
                break;
            case R.id.btn02 :
                text.setTextColor(RED);
                text.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.btn03 :
                text.setTextColor(BLACK);
                text.setBackgroundColor(YELLOW);
                break;
        }
    }

    Button.OnLongClickListener mLong = new Button.OnLongClickListener(){

        @Override
        public boolean onLongClick(View v) {
            String str = "";
            switch(v.getId()){
                case R.id.btn01 :
                    str = "첫번째 버튼";
                    break;
                case R.id.btn02 :
                    str = "두번째 버튼";
                    break;
                case R.id.btn03 :
                    str = "세번째 버튼";
                    break;
            }
            Toast.makeText(MainActivity.this, str,Toast.LENGTH_SHORT).show();
            return false;
        }
    };
}