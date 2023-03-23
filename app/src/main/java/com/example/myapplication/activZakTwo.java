package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activZakTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activ_zak_two);
    }

    //22.03.2023 11:53 5 участник. Денисова Анна. Сессия 5
    public void two (View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(activZakTwo.this, activeZak.class);
        startActivity(intent);
    }

    //22.03.2023 11:56 5 участник. Денисова Анна. Сессия 5
    public void three (View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(activZakTwo.this, svasBank.class);
        startActivity(intent);
    }

}