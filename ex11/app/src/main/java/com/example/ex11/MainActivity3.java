package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    Button btn1,btn2;
    EditText edit;
    ListView list;
    ArrayList<String> data;
    ArrayAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn1 = findViewById(R.id.btn01);
        btn2 = findViewById(R.id.btn02);
        edit = findViewById(R.id.edit);
        list = findViewById(R.id.list);

        data = new ArrayList<>();
        data.add("포도");
        data.add("수박");
        data.add("딸기");

        ad = new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, data);

        list.setAdapter(ad);
        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str = data.get(position);
                Toast.makeText(MainActivity3.this, str, Toast.LENGTH_SHORT).show();
            }
        });

        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edit.getText().toString();
                if(str.length() == 0){
                    Toast.makeText(MainActivity3.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                } else{
                    data.add(str);
                    ad.notifyDataSetChanged();

                }
                }
        });

        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = list.getCheckedItemPosition();
                if(position != ListView.INVALID_POSITION){
                    data.remove(position);
                    list.clearChoices();
                    ad.notifyDataSetChanged();
                }
            }
        });

    }
}