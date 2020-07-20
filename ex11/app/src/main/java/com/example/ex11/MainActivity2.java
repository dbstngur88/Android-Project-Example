package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //출력할 데이터 생성
        ArrayList<String> data = new ArrayList<>();
        data.add("김유신");
        data.add("이순신");
        data.add("강감찬");
        data.add("을지문덕");

        //Adapter 생성
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);

        //어댑터를 리스트뷰에 끼우기
        ListView list = findViewById(R.id.list);
        list.setAdapter(ad);

        //출력할 데이터 생성
        ArrayList<String> data1 = new ArrayList<>();
        data1.add("사과");
        data1.add("배");
        data1.add("딸기");
        data1.add("복숭아");

        //Adapter 생성
        ArrayAdapter ad1 = new ArrayAdapter(this, R.layout.item ,data1);

        //어댑터를 리스트뷰에 끼우기
        ListView list1 = findViewById(R.id.list1);
        list1.setAdapter(ad1);

    }
}