package com.progra.micarteraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edt1,edt2,edt3,edt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.edtn_1);
        edt2 = (EditText)findViewById(R.id.edtn_2);
        edt3 = (EditText)findViewById(R.id.edtn_3);
        edt4 = (EditText)findViewById(R.id.edtn_4);



    }













    //botones para ir a las otras activitys :v
    public void BtnIngresos(View view){
            Intent Ingresos = new Intent(this, com.progra.micarteraapp.Ingresos.class);
            startActivity(Ingresos);
    }

    public void BtnGastos (View view){
        Intent Gastos = new Intent(this, Gastos.class);
        startActivity(Gastos);
    }

    public void BtnMovimientos(View view){
        Intent Movimientos = new Intent(this,Movimientos.class);
        startActivity(Movimientos);
    }


}