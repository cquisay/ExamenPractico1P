package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimeraPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pregunta);
    }

    //Respuesta COrrecta
    public void Correcto(View view){
        Intent Correcto = new Intent(this, SegundaPregunta.class);
        startActivity(Correcto);
    }

    //Ir a pantalla de fallo
    public void Fallo(View view){
        Intent Fallo = new Intent(this, HaPerdido.class);
        startActivity(Fallo);
    }
}