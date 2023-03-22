package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class rashlCatalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rashl_catalog);
    }

    //22.03.2023 15:55 5 участник. Денисова Анна. Сессия 4
    public void dobavlenie(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(rashlCatalog.this, rashlCatalogTwo.class);
        startActivity(intent);
    }

    //22.03.2023 16:39 5 участник. Денисова Анна. Сессия 4
    public void korzinaTwo(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(rashlCatalog.this, korzina.class);
        startActivity(intent);
    }

}