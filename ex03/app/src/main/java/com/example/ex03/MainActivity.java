package com.example.ex03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText korean = findViewById(R.id.korean);
                EditText math = findViewById(R.id.math);
                EditText english = findViewById(R.id.english);
                TextView total = findViewById(R.id.total);
                TextView everage = findViewById(R.id.everage);

                Double koreanscore = Double.parseDouble(korean.getText().toString());
                Double mathscore = Double.parseDouble(math.getText().toString());
                Double englishscore = Double.parseDouble(english.getText().toString());

                Double totalscore = koreanscore + mathscore + englishscore;
                Double everagescore = totalscore / 3;

                total.setText("총점 : "+ totalscore);
                everage.setText("평균 : " + everagescore);

            }
        });
    }
}