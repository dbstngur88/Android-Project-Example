package com.example.ex05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn01 = findViewById(R.id.btn01);
        Button btn02 = findViewById(R.id.btn02);
        Button btn03 = findViewById(R.id.btn03);

        btn01.setOnClickListener(onClickListener);
        btn02.setOnClickListener(onClickListener);
        btn03.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            LinearLayout layout01 = findViewById(R.id.page01);
            LinearLayout layout02 = findViewById(R.id.page02);
            LinearLayout layout03 = findViewById(R.id.page03);
            switch (v.getId()){
                case R.id.btn01 :
                    layout01.setVisibility(View.VISIBLE);
                    layout02.setVisibility(View.INVISIBLE);
                    layout03.setVisibility(View.INVISIBLE);
                    break;
                case R.id.btn02 :
                    layout01.setVisibility(View.INVISIBLE);
                    layout02.setVisibility(View.VISIBLE);
                    layout03.setVisibility(View.INVISIBLE);
                    break;
                case R.id.btn03 :
                    layout01.setVisibility(View.INVISIBLE);
                    layout02.setVisibility(View.INVISIBLE);
                    layout03.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}