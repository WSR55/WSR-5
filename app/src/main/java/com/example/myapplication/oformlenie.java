package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class oformlenie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oformlenie);
    }

    //22.03.2023 10:09 5 участник. Денисова Анна. Сессия 5
    public void vverx(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(oformlenie.this, oformlenieZakaz.class);
        startActivity(intent);
    }

}