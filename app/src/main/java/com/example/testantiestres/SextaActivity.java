package com.example.testantiestres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SextaActivity extends AppCompatActivity {

    private RadioButton rb1,rb2,rb3,rb4,rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexta);

        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
    }

    public void BotonSiguiente(View view){
        int resultadofinal4 = getIntent().getIntExtra("resultadofinal4",0);
        int resultado5 = 0, resultadofinal5 = 0;

        if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked() || rb5.isChecked()) {

            if (rb1.isChecked() == true) {
                resultado5 = resultado5 + 5;
            } else if (rb2.isChecked() == true) {
                resultado5 = resultado5 + 4;
            } else if (rb3.isChecked() == true) {
                resultado5 = resultado5 + 3;
            } else if (rb4.isChecked() == true) {
                resultado5 = resultado5 + 2;
            } else if (rb5.isChecked() == true) {
                resultado5 = resultado5 + 1;
            }
            resultadofinal5 = resultadofinal4 + resultado5;
            Intent i = new Intent(this, SeptimaActivity.class);
            i.putExtra("resultadofinal5", resultadofinal5);
            startActivity(i);

        } else {
            Toast.makeText(getApplicationContext(), "Selecciona una opción, por favor!", Toast.LENGTH_SHORT).show();
        }
    }
}