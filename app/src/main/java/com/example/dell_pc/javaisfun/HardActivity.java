package com.example.dell_pc.javaisfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);
    }
    public void TelaPrincipal(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
