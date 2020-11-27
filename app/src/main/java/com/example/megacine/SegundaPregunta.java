package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pregunta);
    }

    //Respuesta COrrecta
    public void Correcto(View view){
        Intent Correcto = new Intent(this, TerceraPregunta.class);
        startActivity(Correcto);
    }

    //Ir a pantalla de fallo
    public void Fallo(View view){
        Intent Fallo = new Intent(this, HaPerdido.class);
        startActivity(Fallo);
    }
}