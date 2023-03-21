package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreatePassword extends AppCompatActivity {
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_password);
    }
    //21.03.2023 17:14 5 участник. Денисова Анна. Сессия 2
    public void cart(View view) {
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(CreatePassword.this, CreateCart.class);
        startActivity(intent);
    }
}