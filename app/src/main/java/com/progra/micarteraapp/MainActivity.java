package com.progra.micarteraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void BtnIngresos(View view){
            Intent Ingresos = new Intent(this, com.progra.micarteraapp.Ingresos.class);
            startActivity(Ingresos);
    }
}