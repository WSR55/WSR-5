package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class svasBank extends AppCompatActivity {
    //23.03.2023 11:16. 5 участник. Денисова Анна. сессия 5
    private final int bank = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svas_bank);

        //запускаем функцию с помощью run
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(svasBank.this, proizOplata.class);
                startActivity(mainIntent);
                //чтобы экран сам перелистнулся, нужно завершить функцию
                finish();
            }
        }, bank);
    }
}