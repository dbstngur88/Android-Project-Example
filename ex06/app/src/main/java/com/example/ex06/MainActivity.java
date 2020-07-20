package com.example.ex06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText textbox01;
    EditText textbox02;
    TextView resultbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textbox01 = findViewById(R.id.box01);
        textbox02 = findViewById(R.id.box02);
        resultbox = findViewById(R.id.resultbox);

        Button btn01 = findViewById(R.id.btn01);
        Button btn02 = findViewById(R.id.btn02);
        Button btn03 = findViewById(R.id.btn03);
        Button btn04 = findViewById(R.id.btn04);
        btn01.setOnClickListener(onClickListener);
        btn02.setOnClickListener(onClickListener);
        btn03.setOnClickListener(onClickListener);
        btn04.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener(){

        double box01;
        double box02;
        double result;
        @Override
        public void onClick(View v) {

            box01 = Double.parseDouble(textbox01.getText().toString());
            box02 = Double.parseDouble(textbox02.getText().toString());
            switch(v.getId()){
                case R.id.btn01 :
                    result = box01 + box02;
                    resultbox.setText("결과 : " + result);
                    break;

                case R.id.btn02 :
                    result = box01 - box02;
                    resultbox.setText("결과 : " + result);
                    break;

                case R.id.btn03 :
                    result = box01 * box02;
                    resultbox.setText("결과 : " + result);
                    break;

                case R.id.btn04 :
                    result = box01 / box02;
                    resultbox.setText("결과 : " + result);
                    break;
            }
        }
    };

}