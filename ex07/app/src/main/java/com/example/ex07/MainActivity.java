package com.example.ex07;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn01).setOnLongClickListener(mLong);
        findViewById(R.id.btn02).setOnLongClickListener(mLong);
        findViewById(R.id.btn03).setOnLongClickListener(mLong);
        findViewById(R.id.btn04).setOnLongClickListener(mLong);
        findViewById(R.id.btn05).setOnLongClickListener(mLong);
        imageView = findViewById(R.id.imageview);
        int num = 0;

        if(true) {
            for (int i = 0; i <= 100; i++) {
                num = num + i;
            }
        }
        Toast.makeText(MainActivity.this, "결과 : " + num, Toast.LENGTH_SHORT).show();

    }



    Button.OnLongClickListener mLong = new View.OnLongClickListener(){
        String str;
        @Override
        public boolean onLongClick(View v) {
            switch (v.getId()){
                case R.id.btn01 :
                    str = "1번째 이미지입니다.";
                    break;
                case R.id.btn02 :
                    str = "2번째 이미지입니다.";
                    break;
                case R.id.btn03 :
                    str = "3번째 이미지입니다.";
                    break;
                case R.id.btn04 :
                    str = "4번째 이미지입니다.";
                    break;
                case R.id.btn05 :
                    str = "5번째 이미지입니다.";
                    break;
            }
            Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            return false;
        }
    };

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn01 :
                imageView.setImageResource(R.drawable.car01);
                break;
            case R.id.btn02 :
                imageView.setImageResource(R.drawable.car02);
                break;
            case R.id.btn03 :
                imageView.setImageResource(R.drawable.car03);
                break;
            case R.id.btn04 :
                imageView.setImageResource(R.drawable.car04);
                break;
            case R.id.btn05 :
                imageView.setImageResource(R.drawable.car05);
                break;
        }
    }
}