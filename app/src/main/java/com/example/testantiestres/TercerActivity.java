package com.example.testantiestres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TercerActivity extends AppCompatActivity {

    private RadioButton rb1, rb2, rb3, rb4, rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);

        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
    }

        public void BotonSiguiente(View view){
            int resultadofinal1 = getIntent().getIntExtra("resultadofinal1",0);
            int resultado2 = 0, resultadofinal2 = 0;

            if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked() || rb5.isChecked()) {

                if (rb1.isChecked() == true) {
                    resultado2 = resultado2 + 5;
                } else if (rb2.isChecked() == true) {
                    resultado2 = resultado2 + 4;
                } else if (rb3.isChecked() == true) {
                    resultado2 = resultado2 + 3;
                } else if (rb4.isChecked() == true) {
                    resultado2 = resultado2 + 2;
                } else if (rb5.isChecked() == true) {
                    resultado2 = resultado2 + 1;
                }
                resultadofinal2 = resultadofinal1 + resultado2;
                Intent i = new Intent(this, CuartaActivity.class);
                i.putExtra("resultadofinal2", resultadofinal2);
                startActivity(i);

            } else {
                Toast.makeText(getApplicationContext(), "Selecciona una opción, por favor!", Toast.LENGTH_SHORT).show();
            }
        }
    }

