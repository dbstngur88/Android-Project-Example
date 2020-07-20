package com.example.ex06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText box1,box2;
    TextView resultbox;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box1 = findViewById(R.id.box01);
        box2 = findViewById(R.id.box02);
        resultbox = findViewById(R.id.resultbox);
    }

    public void mClick(View v){
        Toast.makeText(MainActivity2.this, "결과를 출력합니다.", Toast.LENGTH_SHORT).show();
        double num1 = Double.parseDouble(box1.getText().toString());
        double num2 = Double.parseDouble(box2.getText().toString());
        switch(v.getId()){
            case R.id.btn01 :
                result = num1 + num2;
                resultbox.setText("결과 : " + result);
                break;
            case R.id.btn02 :
                result = num1 - num2;
                resultbox.setText("결과 : " + result);
                break;
            case R.id.btn03 :
                result = num1 * num2;
                resultbox.setText("결과 : " + result);
                break;
            case R.id.btn04 :
                result = num1 / num2;
                resultbox.setText("결과 : " + result);
                break;
        }
    }
}