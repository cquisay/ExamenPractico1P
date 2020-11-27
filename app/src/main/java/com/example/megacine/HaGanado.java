package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HaGanado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ha_ganado);
    }

    //Regresar a la pantalla inicial
    public void SalirFinal(View view){
        Intent SalirFinal = new Intent(this, MainActivity.class);
        startActivity(SalirFinal);
    }
}