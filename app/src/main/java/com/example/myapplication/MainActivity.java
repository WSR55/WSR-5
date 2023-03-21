package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    //10:46 21.03.23 5 участник Денисова Анна Сессия 1
    //устанавливаем значение таймера, через сколько секунд он должен пролистнуться
    private final int ll = 5000;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //запускаем функцию с помощью run
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent mainIntent = new Intent(MainActivity.this, OnboardOne.class);
                    startActivity(mainIntent);
                    //чтобы экран сам перелистнулся, нужно завершить функцию
                    finish();
                }
            }, ll);
        }
    }