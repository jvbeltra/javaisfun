package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Operadores3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operadores3);
        findViewById(R.id.textView36).setVisibility(View.GONE);
        findViewById(R.id.imageButton35).setVisibility(View.GONE);
    }

    public void passarDireita(View view) {
        findViewById(R.id.textView36).setVisibility(View.VISIBLE);
        findViewById(R.id.textView41).setVisibility(View.GONE);
        findViewById(R.id.imageButton35).setVisibility(View.VISIBLE);
        findViewById(R.id.imageButton29).setVisibility(View.GONE);

    }

    public void passarEsquerda(View view) {
        findViewById(R.id.textView36).setVisibility(View.GONE);
        findViewById(R.id.textView41).setVisibility(View.VISIBLE);
        findViewById(R.id.imageButton35).setVisibility(View.GONE);
        findViewById(R.id.imageButton29).setVisibility(View.VISIBLE);

    }




    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Operadores3.this, MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }


    public void next(View view){
        Intent intent = new Intent(this, Operadores4.class);
        startActivity(intent);
    }
}
