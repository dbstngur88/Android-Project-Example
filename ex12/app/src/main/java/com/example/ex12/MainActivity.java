package com.example.ex12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list, list1;
    ArrayList<String> data;
    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);
        list1 = findViewById(R.id.list1);
        spin = findViewById(R.id.spinner01);
        spin.setPrompt("선택하세요.");

        data = new ArrayList<String>();
        data.add("바나나");
        data.add("포도");
        data.add("수박");

        ArrayAdapter ad1;
        ad1 = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice,data);


        ArrayAdapter ad2;
        ad2 = new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice,data);

        ArrayAdapter ad3;
        ad3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item,data);
        ad3.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        list.setAdapter(ad1);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        list1.setAdapter(ad2);
        list1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        spin.setAdapter(ad3);
    }

}