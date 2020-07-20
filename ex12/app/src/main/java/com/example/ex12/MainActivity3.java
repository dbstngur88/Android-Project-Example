package com.example.ex12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    ListView list;
    ArrayList<Address> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        data = new ArrayList<Address>();
        Address address;
        address = new Address(R.drawable.car01, "윤수혁", "천안시 서북구 불당동", "010-2334-3926");
        data.add(address);
        address = new Address(R.drawable.car01, "이하림", "서울시 성북구 장위로", "010-4326-2629");
        data.add(address);

        list = findViewById(R.id.list);

        Myadapter ad = new Myadapter();
        list.setAdapter(ad);

    }

    class Myadapter extends BaseAdapter{

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
            convertView = getLayoutInflater().inflate(R.layout.item_add,parent,false);
            ImageView img = convertView.findViewById(R.id.img);
            TextView name = convertView.findViewById(R.id.name);
            TextView address = convertView.findViewById(R.id.add);
            TextView tel = convertView.findViewById(R.id.tel);

            img.setImageResource(data.get(position).img);
            name.setText(data.get(position).name);
            address.setText(data.get(position).address);
            tel.setText(data.get(position).tel);

            return convertView;
        }
    }


}