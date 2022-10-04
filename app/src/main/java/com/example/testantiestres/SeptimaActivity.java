package com.example.testantiestres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class SeptimaActivity extends AppCompatActivity {

    private RadioButton rb1,rb2,rb3,rb4,rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_septima);

        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
    }

    public void BotonSiguiente(View view){
        int resultadofinal5 = getIntent().getIntExtra("resultadofinal5",0);
        int resultado6 = 0, resultadofinal6 = 0;

        if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked() || rb5.isChecked()) {

            if (rb1.isChecked() == true) {
                resultado6 = resultado6 + 5;
            } else if (rb2.isChecked() == true) {
                resultado6 = resultado6 + 4;
            } else if (rb3.isChecked() == true) {
                resultado6 = resultado6 + 3;
            } else if (rb4.isChecked() == true) {
                resultado6 = resultado6 + 3;
            } else if (rb5.isChecked() == true) {
                resultado6 = resultado6 + 1;
            }
            resultadofinal6 = resultadofinal5 + resultado6;
            Intent i = new Intent(this, OctavaActivity.class);
            i.putExtra("resultadofinal6", resultadofinal6);
            startActivity(i);

        } else {
            Toast.makeText(getApplicationContext(), "Selecciona una opción, por favor!", Toast.LENGTH_SHORT).show();
        }
    }
}
