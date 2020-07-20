package com.example.ex13;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Address> data;
    ListView list;
    MyAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<Address>();
        Address address;
        address = new Address("윤수혁", "서북구 불당 17길");
        data.add(address);
        address = new Address("이하림", "성북구 장위로 2");
        data.add(address);

        list = findViewById(R.id.list);

        ad = new MyAdapter();
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
        public View getView(final int position, View convertView, ViewGroup parent) {
            convertView =getLayoutInflater().inflate(R.layout.item,parent, false);
            TextView address =convertView.findViewById(R.id.add);
            TextView name = convertView.findViewById(R.id.name);
            Button btn = convertView.findViewById(R.id.btn);

            name.setText(data.get(position).name);
            address.setText(data.get(position).add);

            btn.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("삭제 경고");
                    alert.setMessage(data.get(position).name+ "(을)를 정말 삭제하시겠습니까?");
                    alert.setIcon(R.drawable.ic_launcher_background);
                    alert.setPositiveButton("네", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            data.remove(position);
                            ad.notifyDataSetChanged();
                            Toast.makeText(MainActivity.this, "삭제 완료", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alert.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "삭제 취소", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alert.show();
                }
            });


            return convertView;
        }
    }
}