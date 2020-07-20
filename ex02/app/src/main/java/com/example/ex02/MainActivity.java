package com.example.ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);

        //버튼을 클릭했을 때 이름 출력
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.name);
                String msg = editText.getText().toString();

                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();

            }
        });

        Button btn1 = findViewById(R.id.btn2);
        btn1.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.name2);
                String msg = editText.getText().toString();

                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
            }
        });
    }

}