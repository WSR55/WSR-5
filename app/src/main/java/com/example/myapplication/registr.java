package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registr extends AppCompatActivity {
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);
    }

    //21.03.2023 15:23 5 участник. Денисова Анна. Сессия 2
    public void registr(View view) {
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(registr.this, CodeEmail.class);
        startActivity(intent);
    }

}