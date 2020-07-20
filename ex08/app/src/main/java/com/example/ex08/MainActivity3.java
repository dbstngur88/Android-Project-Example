package com.example.ex08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void mClick(View view){
        switch (view.getId()){
            case R.id.btn1 :
                break;
            case R.id.btn2 :
                LinearLayout linear2 = (LinearLayout)View.inflate(MainActivity3.this, R.layout.custom1,null);
                //inflate -> 생성기, LinearLayout으로 구성된 custom.xml을 this MainActivity3에 출력을 해준다는 뜻
                Toast toast2 = new Toast(MainActivity3.this);
                toast2.setView(linear2);
                toast2.show();
                break;
            case R.id.btn3 :
                count++;
                Toast.makeText(MainActivity3.this, "현재 카운트 : " + count, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4 :
                LinearLayout linear = (LinearLayout)View.inflate(MainActivity3.this, R.layout.custom,null);
                //inflate -> 생성기, LinearLayout으로 구성된 custom.xml을 this MainActivity3에 출력을 해준다는 뜻
                Toast toast = new Toast(MainActivity3.this);
                toast.setView(linear);
                toast.show();
                break;
        }
    }
}