package com.example.ex12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void mClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btn1 :
                intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn2 :
                intent = new Intent(MenuActivity.this,MainActivity2.class);
                startActivity(intent);
                break;
            case R.id.btn3 :
                intent = new Intent(MenuActivity.this,MainActivity3.class);
                startActivity(intent);
                break;
            case R.id.btn4 :
                intent = new Intent(MenuActivity.this,MainActivity4.class);
                startActivity(intent);
                break;
            case R.id.btn5 :
                intent = new Intent(MenuActivity.this,MainActivity5.class);
                startActivity(intent);
                break;
        }
    }
}