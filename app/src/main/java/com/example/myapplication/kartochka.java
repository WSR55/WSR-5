package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kartochka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kartochka);
    }
    //22.03.2023 15:31 5 участник. Денисова Анна. Сессия 4
    public void profile(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(kartochka.this, CartPacientNeFoto.class);
        startActivity(intent);
    }

    //22.03.2023 15:31 5 участник. Денисова Анна. Сессия 4
    public void catalogTwo(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(kartochka.this, rashlCatalog.class);
        startActivity(intent);
    }
}