package com.example.megacine;

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

    //Ir a la primera pregunta
    public void Inicio(View view){
        Intent Inicio = new Intent(this, PrimeraPregunta.class);
        startActivity(Inicio);
    }

}

