package com.example.ex02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub2);


        //버튼 클릭 시 전화번호 출력
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.number);
                String msg = editText.getText().toString();

                Toast.makeText(MainActivity2.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }

}