package com.progra.micarteraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Ingresos extends AppCompatActivity {

    private Spinner  spinner1;
    private EditText edt1, edt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);


        //comunicacion con los EditText
        edt1 = (EditText)findViewById(R.id.edt_1_i);
        edt2 = (EditText)findViewById(R.id.edtn_1_i);


        //creacion del spinner
        spinner1 = (Spinner)findViewById(R.id.spinner2);

        String [] Ingresos ={"Ingresos activos","Ingresos pasivos"};

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item_spinners, Ingresos);
        spinner1.setAdapter(adapter);

    }


    //metodos para los botones
    //para ir entre activitys

    public void BtnInicio(View view){
        Intent Inicio = new Intent(this,MainActivity.class);
        startActivity(Inicio);
    }

    public void BtnGastos (View view){
        Intent Gastos = new Intent(this, com.progra.micarteraapp.Gastos.class);
        startActivity(Gastos);
    }

    public void BtnMovimientos(View view){
        Intent Movimientos = new Intent(this,Movimientos.class);
        startActivity(Movimientos);
    }


}