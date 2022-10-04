package com.example.testantiestres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuintaActivity extends AppCompatActivity {

    private RadioButton rb1,rb2,rb3,rb4,rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinta);

        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
    }

    public void BotonSiguiente(View view){
        int resultadofinal3 = getIntent().getIntExtra("resultadofinal3",0);
        int resultado4 = 0, resultadofinal4 = 0;

        if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked() || rb5.isChecked()) {

            if (rb1.isChecked() == true) {
                resultado4 = resultado4 + 5;
            } else if (rb2.isChecked() == true) {
                resultado4 = resultado4 + 4;
            } else if (rb3.isChecked() == true) {
                resultado4 = resultado4 + 3;
            } else if (rb4.isChecked() == true) {
                resultado4 = resultado4 + 2;
            } else if (rb5.isChecked() == true) {
                resultado4 = resultado4 + 1;
            }
            resultadofinal4 = resultadofinal3 + resultado4;
            Intent i = new Intent(this, SextaActivity.class);
            i.putExtra("resultadofinal4", resultadofinal4);
            startActivity(i);

        } else {
            Toast.makeText(getApplicationContext(), "Selecciona una opción, por favor!", Toast.LENGTH_SHORT).show();
        }
    }
}
