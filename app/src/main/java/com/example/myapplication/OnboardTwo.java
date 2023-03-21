package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnboardTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard_two);
    }

    //Объявляем название функции и ее переменные 10:40 1 сессия 5 участник Денисова Анна
    public void onboardTwo(View view){
        //intent отвечает за переход по страницам
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(OnboardTwo.this, OnboardThree.class);
        startActivity(intent);
    }
}