package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class korzina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korzina);
    }


    //22.03.2023 16:35 5 участник. Денисова Анна. Сессия 4
    public void oformlenie(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(korzina.this, oformlenie.class);
        startActivity(intent);
    }

    //22.03.2023 16:37 5 участник. Денисова Анна. Сессия 4
    public void next(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(korzina.this, rashlCatalog.class);
        startActivity(intent);
    }

}