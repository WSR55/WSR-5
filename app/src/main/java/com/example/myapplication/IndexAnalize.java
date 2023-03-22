package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IndexAnalize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_analize);
    }

    //22.03.2023 09:55 5 участник. Денисова Анна. Сессия 3
    public void search(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим(в моём случае мы находимся
        // на главной странице Анализов и переходим на страницу Главная/Поиск/Начало
        Intent intent = new Intent(IndexAnalize.this, IndexSearch.class);
        startActivity(intent);
    }

    //22.03.2023 10:42 5 участник. Денисова Анна. Сессия 3
    public void profile(View view){
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим(в моём случае мы находимся
        // на главной странице Анализов и переходим на страницу Главная/Поиск/Начало
        Intent intent = new Intent(IndexAnalize.this, CartPacientNeFoto.class);
        startActivity(intent);
    }



}