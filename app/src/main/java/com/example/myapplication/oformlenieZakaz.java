package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class oformlenieZakaz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oformlenie_zakaz);
    }

    //22.03.2023 09:39 5 участник. Денисова Анна. Сессия 5
    public void back(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(oformlenieZakaz.this, korzina.class);
        startActivity(intent);
    }

    //22.03.2023 10:08 5 участник. Денисова Анна. Сессия 5
    public void vnis(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(oformlenieZakaz.this, oformlenie.class);
        startActivity(intent);
    }

    //22.03.2023 11:43 5 участник. Денисова Анна. Сессия 5
    public void adress(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(oformlenieZakaz.this, adress.class);
        startActivity(intent);
    }

}