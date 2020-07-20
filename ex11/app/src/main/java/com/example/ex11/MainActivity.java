package com.example.ex11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img01);
        img2 = findViewById(R.id.img02);
        registerForContextMenu(img1);
        registerForContextMenu(img2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if(v==img1){
            menu.setHeaderTitle("현대자동차");
        menu.add(0,1,0,"그랜저");
        menu.add(0,2,0,"소나타");
        menu.add(0,3,0,"제네시스");

    }
        if(v==img2){
        menu.setHeaderTitle("현대자동차");
        menu.add(0,4,0,"K5");
        menu.add(0,5,0,"K7");
        menu.add(0,6,0,"카니발");

    }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 1:
                img1.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 2:
                img1.setImageResource(R.drawable.ic_launcher_foreground);
                break;
            case 3:
                img1.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 4:
                img1.setImageResource(R.drawable.ic_launcher_foreground);
                break;
            case 5:
                img1.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 6:
                img1.setImageResource(R.drawable.ic_launcher_foreground);
                break;
        }
        return super.onContextItemSelected(item);
    }
}