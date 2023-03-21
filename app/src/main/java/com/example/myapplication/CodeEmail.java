package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CodeEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_email);
    }
    //21.03.2023 15:35 5 участник. Денисова Анна. Сессия 2
    public void code(View view) {
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(CodeEmail.this, registr.class);
        startActivity(intent);
    }

    //21.03.2023 16:09 5 участник. Денисова Анна. Сессия 2
    public void createPass(View view) {
        //объявляем intent, выделяем для него память, указываем на какой странице мы находимся и на какую переходим
        Intent intent = new Intent(CodeEmail.this, CreatePassword.class);
        startActivity(intent);
    }

}