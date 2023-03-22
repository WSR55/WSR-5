package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateCartZap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_cart_zap);
    }

    //22.03.2023 10:00 5 участник. Денисова Анна. Сессия 3
    public void indexAnalize(View view) {
        /*объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим.
       со страницы создание карты мы переходим на главную страницу анализов*/
        Intent intent = new Intent(CreateCartZap.this, IndexAnalize.class);
        startActivity(intent);
    }

}