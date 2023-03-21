package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnboardOne extends AppCompatActivity {
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard_one);
        }
        //21.03.2023 10:20 5 участник. Денисова Анна. Сессия 1
        public void onboardOne(View view){
            //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
            Intent intent = new Intent(OnboardOne.this, OnboardTwo.class);
            startActivity(intent);
    }
}