package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Spinner spin1 = findViewById(R.id.spinner1);
        Spinner spin2 = findViewById(R.id.spinner2);
        Spinner spin3 = findViewById(R.id.spinner3);
        spin1.setPrompt("과일을 고르세요.");
        spin2.setPrompt("음식을 고르세요.");
        spin3.setPrompt("차량을 고르세요.");

        ArrayList<String> data = new ArrayList<String>();
        data.add("그랜저");
        data.add("소나타");
        data.add("K5");

        final ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.fruits,android.R.layout.simple_spinner_item);
        final ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,R.array.foods,android.R.layout.simple_spinner_item);
        final ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item,data);
        adapter1.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        adapter2.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        adapter3.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spin1.setAdapter(adapter1);
        spin2.setAdapter(adapter2);
        spin3.setAdapter(adapter3);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity5.this, adapter1.getItem(position)+ "는 맛있다.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity5.this, adapter2.getItem(position)+ "는 맛있다.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity5.this, adapter3.getItem(position)+ "는 사고싶다.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}