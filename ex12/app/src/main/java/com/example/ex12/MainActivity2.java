package com.example.ex12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ListView list;
    ArrayList<Product> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        data = new ArrayList<Product>();
        Product product;
        product = new Product(R.drawable.car01, "소나타", 2000);
        data.add(product);
        product = new Product(R.drawable.car02, "그랜저", 3000);
        data.add(product);
        product = new Product(R.drawable.car03, "제네시스", 4000);
        data.add(product);
        product = new Product(R.drawable.car04, "K5", 5000);
        data.add(product);
        product = new Product(R.drawable.car05, "K7", 6000);
        data.add(product);

        MyAdapter ad = new MyAdapter();
        list = findViewById(R.id.list);
        list.setAdapter(ad);

    }


    class MyAdapter extends BaseAdapter{

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
            convertView = getLayoutInflater().inflate(R.layout.item, parent, false);
            ImageView img = convertView.findViewById(R.id.img01);
            final TextView name = convertView.findViewById(R.id.name);
            TextView price = convertView.findViewById(R.id.price);
            Button btn = convertView.findViewById(R.id.btn);

            img.setImageResource(data.get(position).img);
            name.setText(data.get(position).name);
            price.setText(data.get(position).price + "만원");
            btn.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity2.this, name.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });

            return convertView;
        }
    }
}