package com.example.ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button upbtn = findViewById(R.id.btn1);
        Button downbtn = findViewById(R.id.btn2);

        //증가버튼 클릭
        upbtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView count = findViewById(R.id.count);
                cnt=cnt+1;
                count.setText(cnt + "");
            }
        });

        //감소버튼 클릭
        downbtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView count = findViewById(R.id.count);
                cnt=cnt-1;
                count.setText(cnt + "");
            }
        });


        //증가버튼 롱클릭
        upbtn.setOnLongClickListener(new Button.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                TextView count = findViewById(R.id.count);
                cnt=100;
                count.setText(cnt + "");
                return true;
            }
        });


        //감소버튼 롱클릭
        downbtn.setOnLongClickListener(new Button.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                TextView count = findViewById(R.id.count);
                cnt=0;
                count.setText(cnt + "");
                return true;
            }
        });
    }
}