package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class rashlCatalogTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rashl_catalog_two);
    }

    //22.03.2023 16:38 5 участник. Денисова Анна. Сессия 4
    public void korzina(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(rashlCatalogTwo.this, korzina.class);
        startActivity(intent);
    }

}