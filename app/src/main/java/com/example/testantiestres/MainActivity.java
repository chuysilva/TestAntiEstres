package com.example.testantiestres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // La actividad esta creada
    }

    public void CambiarActivity(View view){
        Intent siguiente = new Intent(this, SegundoActivity.class);
        startActivity(siguiente);
    }
}