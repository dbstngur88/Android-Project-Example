package com.example.ex13;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mClick(View view) {
        switch(view.getId()){
            case R.id.btn1 :
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("알림");
                alert.setMessage("알립니다...");
                alert.setPositiveButton("예",null);
                alert.show();
                break;
            case R.id.btn2 :
                alert = new AlertDialog.Builder(this);
                alert.setTitle("질의");
                alert.setMessage("저장하시겠습니까?");
                alert.setPositiveButton("예", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "저장완료",Toast.LENGTH_SHORT).show();
                    }
                });
                alert.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "취소", Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
                break;
            case R.id.btn3 :
                final String foods[] = new String[]{"짜장면", "우동", "짬뽕", "탕수육"};
                final TextView text1 = findViewById(R.id.text1);
                alert = new AlertDialog.Builder(this);
                alert.setTitle("음식을 선택하세요!");
                alert.setItems(foods, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, foods[which],Toast.LENGTH_SHORT).show();
                        text1.setText(foods[which]);
                    }
                });
                alert.setPositiveButton("닫기", null);
                alert.show();
                break;
            case R.id.btn4 :
                final LinearLayout order = (LinearLayout) view.inflate(MainActivity.this, R.layout.order,null);
                alert = new AlertDialog.Builder(this);
                alert.setTitle("주문정보");
                alert.setView(order);
                alert.setPositiveButton("주문", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        EditText name = order.findViewById(R.id.name);
                        EditText num = order.findViewById(R.id.num);
                        CheckBox check = order.findViewById(R.id.check);
                        String strName = name.getText().toString();
                        String strNum = num.getText().toString();
                        String strCheck = check.isChecked()?"유":"무";

                        Toast.makeText(MainActivity.this,"상품 명 : " + strName + "\n상품 수량 : " + strNum + "\n착불결제 : "+ strCheck,Toast.LENGTH_SHORT).show();
                    }
                });
                alert.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "주문 취소", Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
                break;

        }
    }
}