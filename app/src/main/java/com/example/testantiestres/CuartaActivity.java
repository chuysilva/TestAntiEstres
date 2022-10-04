package com.example.testantiestres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class CuartaActivity extends AppCompatActivity {

    private RadioButton rb1,rb2,rb3,rb4,rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta);

        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
    }

    public void BotonSiguiente(View view){
        int resultadofinal2 = getIntent().getIntExtra("resultadofinal2",0);
        int resultado3 = 0, resultadofinal3 = 0;

        if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked() || rb5.isChecked()) {

            if (rb1.isChecked() == true) {
                resultado3 = resultado3 + 5;
            } else if (rb2.isChecked() == true) {
                resultado3 = resultado3 + 4;
            } else if (rb3.isChecked() == true) {
                resultado3 = resultado3 + 3;
            } else if (rb4.isChecked() == true) {
                resultado3 = resultado3 + 2;
            } else if (rb5.isChecked() == true) {
                resultado3 = resultado3 + 1;
            }
            resultadofinal3 = resultadofinal2 + resultado3;
            Intent i = new Intent(this, QuintaActivity.class);
            i.putExtra("resultadofinal3", resultadofinal3);
            startActivity(i);

        } else {
            Toast.makeText(getApplicationContext(), "Selecciona una opción, por favor!", Toast.LENGTH_SHORT).show();
        }
    }
}