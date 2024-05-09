package com.example.myapplication;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Teladois extends AppCompatActivity {

    public void Voltar(View view) {
        Intent in = new Intent(Teladois.this, MainActivity.class);
        startActivity(in);
    }
}
