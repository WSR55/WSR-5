package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CartPacientNeFoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_pacient_ne_foto);
    }
    //22.03.2023 11:57 5 участник. Денисова Анна. Сессия 3
    public void analiz(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим(в моём случае мы находимся
        // на главной странице Анализов и переходим на страницу Главная/Поиск/Начало
        Intent intent = new Intent(CartPacientNeFoto.this, IndexAnalize.class);
        startActivity(intent);
    }

}