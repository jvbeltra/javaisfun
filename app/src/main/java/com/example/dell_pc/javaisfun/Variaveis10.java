package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Variaveis10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variaveis10);
    }

    public void homeBasic(View view){
        Intent intent = new Intent(this, EasyActivity.class);
        startActivity(intent);
    }
    public void nextexercise(View view){
        Intent intent = new Intent(this, Operadores.class);
        startActivity(intent);
    }
}