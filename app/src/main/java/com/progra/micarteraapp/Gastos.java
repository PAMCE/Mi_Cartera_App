package com.progra.micarteraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Gastos extends AppCompatActivity {

    private Spinner spinner2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);


        // creacion del spinner
        spinner2 = (Spinner)findViewById(R.id.spinner2);

        String [] Gastos = {"Agua","Luz","Internet","Cable","Comida","Transporte"};

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item_spinners, Gastos);
        spinner2.setAdapter(adapter);



    }

    public void BtnInicio(View view){
        Intent Inicio = new Intent(this,MainActivity.class);
        startActivity(Inicio);


    }

    public void BtnMovimientos(View view) {
        Intent Movimientos = new Intent(this, Movimientos.class);
        startActivity(Movimientos);
    }


    public void BtnIngresos(View view){
        Intent Ingresos = new Intent(this, com.progra.micarteraapp.Ingresos.class);
        startActivity(Ingresos);
    }
}