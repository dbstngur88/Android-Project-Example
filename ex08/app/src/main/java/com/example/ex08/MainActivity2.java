package com.example.ex08;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;

public class MainActivity2  extends AppCompatActivity {
    LinearLayout page01,page02,page03;
    ImageView imagebox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        page01 = findViewById(R.id.page01);
        page02 = findViewById(R.id.page02);
        page03 = findViewById(R.id.page03);

        imagebox = findViewById(R.id.boxImageView);

        page01.setVisibility(View.INVISIBLE);
        page02.setVisibility(View.INVISIBLE);
        page03.setVisibility(View.INVISIBLE);
        Button btnPrint = findViewById(R.id.btnPrint);
        btnPrint.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.name);
                String strName = name.getText().toString();
                Toast.makeText(MainActivity2.this, strName, Toast.LENGTH_SHORT).show();
            }
        });
        Button btnSum = findViewById(R.id.btnSum);
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = 0;
                for(int i = 0; i<100; i++){
                    num = num+ (i+1);
                }
                Toast.makeText(MainActivity2.this, "결과 : " + num, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void mClick(View view) {
        page01.setVisibility(View.INVISIBLE);
        page02.setVisibility(View.INVISIBLE);
        page03.setVisibility(View.INVISIBLE);
        switch (view.getId()){
            case R.id.btn01 :
                page01.setVisibility(View.VISIBLE);
                break;
            case R.id.btn02 :
                page02.setVisibility(View.VISIBLE);
                break;
            case R.id.btn03 :
                page03.setVisibility(View.VISIBLE);
                break;
        }
    }


    public void mImage(View view) {
        switch (view.getId()){
            case R.id.btnImage01 :
                imagebox.setImageResource(R.drawable.car01);
                break;
            case R.id.btnImage02 :
                imagebox.setImageResource(R.drawable.car02);
                break;
            case R.id.btnImage03 :
                imagebox.setImageResource(R.drawable.car03);
                break;
        }
    }
}