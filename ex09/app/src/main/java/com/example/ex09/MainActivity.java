package com.example.ex09;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        ImageView image = findViewById(R.id.image);
        switch (item.getItemId()){
            case R.id.item1 :
                image.setImageResource(R.drawable.item01);
                break;
            case R.id.item2 :
                image.setImageResource(R.drawable.item02);
                break;
            case R.id.item3 :
                break;
            case R.id.item4 :
                image.setImageResource(R.drawable.item03);
                break;
            case R.id.item5 :
                image.setImageResource(R.drawable.item04);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}