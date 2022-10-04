package com.example.testantiestres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class NovenaActivity extends AppCompatActivity {

    private RadioButton rb1, rb2, rb3, rb4, rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novena);

        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
    }

    public void BotonSiguiente(View view){
        int resultadofinal7 = getIntent().getIntExtra("resultadofinal7",0);
        int resultado8 = 0, resultadofinal8 = 0;

        if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked() || rb5.isChecked()) {

            if (rb1.isChecked() == true) {
                resultado8 = resultado8 + 5;
            } else if (rb2.isChecked() == true) {
                resultado8 = resultado8 + 4;
            } else if (rb3.isChecked() == true) {
                resultado8 = resultado8 + 3;
            } else if (rb4.isChecked() == true) {
                resultado8 = resultado8 + 2;
            } else if (rb5.isChecked() == true) {
                resultado8 = resultado8 + 1;
            }
            resultadofinal8 = resultadofinal7 + resultado8;
            Intent i = new Intent(this, DecimaActivity.class);
            i.putExtra("resultadofinal8", resultadofinal8);
            startActivity(i);

        } else {
            Toast.makeText(getApplicationContext(), "Selecciona una opción, por favor!", Toast.LENGTH_SHORT).show();
        }
    }
}
