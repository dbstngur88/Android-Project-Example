package com.example.ex12;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity4 extends AppCompatActivity {
    ProgressBar pro1,pro2;
    int mYear,mMonth,mDay,mHour, mMinute;
    TextView date, time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        pro1 = findViewById(R.id.pro1);
        pro2 = findViewById(R.id.pro    2);
        date = findViewById(R.id.date);
        time = findViewById(R.id.time);

        Calendar cal = new GregorianCalendar();
        mYear = cal.get(Calendar.YEAR);
        mMonth = cal.get(Calendar.MONTH);
        mDay = cal.get(Calendar.DAY_OF_MONTH);
        mHour = cal.get(Calendar.HOUR_OF_DAY);
        mMinute = cal.get(Calendar.MINUTE);
        updateNow();
    }
    private void updateNow(){
        date.setText(mYear + "년 " + (mMonth+1) + "월 " + mDay + "일");
        time.setText(mHour + "시 " + mMinute + "분");

    }

    public void mClick(View view){
        switch (view.getId()){
            case R.id.btn1 :        //감소
                pro1.incrementProgressBy(-10);
                break;
            case R.id.btn2 :        //증가
                pro1.incrementProgressBy(10);
                break;
            case R.id.btn3 :        //보이게
                pro2.setVisibility(View.VISIBLE);
                break;
            case R.id.btn4 :        //안보이게
                pro2.setVisibility(View.INVISIBLE);
                break;
            case R.id.date :
                new DatePickerDialog(MainActivity4.this, mDateSet, mYear,mMonth,mDay).show();
                break;
            case R.id.time :
                new TimePickerDialog(MainActivity4.this, mTimeSet, mHour, mMinute, false).show();
        }
    }
    DatePickerDialog.OnDateSetListener mDateSet = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            mYear = year;
            mMonth = month;
            mDay = dayOfMonth;
            updateNow();
        }
    };

    TimePickerDialog.OnTimeSetListener mTimeSet = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            mHour = hourOfDay;
            mMinute = minute;
            updateNow();
        }
    };
}