package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    ArrayList<Item> data;
    MyAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        data = new ArrayList<Item>();
        Item item = new Item(R.drawable.ic_launcher_background, "그랜저", 5000);
        data.add(item);
        item = new Item(R.drawable.ic_launcher_foreground,"소나타",3000);
        data.add(item);
        item = new Item(R.drawable.ic_launcher_background,"아반테",2000);
        data.add(item);

        ad = new MyAdapter();

        ListView list = findViewById(R.id.list);
        list.setAdapter(ad);
    }

    //어댑터 정의
    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.itemlist, parent, false);
            ImageView img =convertView.findViewById(R.id.img);
            img.setImageResource(data.get(position).img);
            TextView name = convertView.findViewById(R.id.name);
            name.setText(data.get(position).name);
            final String strName = data.get(position).name;
            TextView price = convertView.findViewById(R.id.price);
            price.setText(data.get(position).price + "만원");
            final int pdprice = data.get(position).price;

            Button btn = convertView.findViewById(R.id.btn);
            btn.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity4.this, strName + " : " + pdprice + "만원", Toast.LENGTH_SHORT).show();
                }
            });

            return convertView;
        }
    }


    //itemlist를 생성해주는 item클래스
    class Item{
        int img;
        int price;
        String name;

        public Item() {
        }

        public Item(int img, String name,int price) {
            this.img = img;
            this.name = name;
            this.price = price;
        }
    }
}