package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HaPerdido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ha_perdido);
    }

    //Ir a la primera pregunta
    public void Inicio(View view){
        Intent Inicio = new Intent(this, PrimeraPregunta.class);
        startActivity(Inicio);
    }

    //Regresar a la pantalla inicial
    public void Salir(View view){
        Intent Salir = new Intent(this, MainActivity.class);
        startActivity(Salir);
    }
}