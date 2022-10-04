package com.example.testantiestres;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SegundoActivity extends AppCompatActivity {

    private RadioButton rb1, rb2, rb3, rb4, rb5;

    @Override public void onBackPressed() { }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        //Establecer comunicación entre la parte logica y grafica de la app
        rb1 = (RadioButton)findViewById(R.id.radioButton);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb3 = (RadioButton)findViewById(R.id.radioButton3);
        rb4 = (RadioButton)findViewById(R.id.radioButton4);
        rb5 = (RadioButton)findViewById(R.id.radioButton5);
    }
     //Metodo para el botón
        public void BotonSiguiente(View view){
        int resultado1 = 0;

            if(rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked() || rb5.isChecked()){

                if (rb1.isChecked() == true) {
                    resultado1 = resultado1 + 5;
                } else if (rb2.isChecked() == true) {
                    resultado1 = resultado1 + 4;
                } else if (rb3.isChecked() == true) {
                    resultado1 = resultado1 + 3;
                } else if (rb4.isChecked() == true) {
                    resultado1 = resultado1 + 2;
                } else if (rb5.isChecked() == true) {
                    resultado1 = resultado1 + 1;
                }
                 Intent i = new Intent(this, TercerActivity.class);
                 i.putExtra("resultadofinal1", resultado1);
                 startActivity(i);

            }else{
                Toast.makeText(getApplicationContext(), "Selecciona una opción, por favor!", Toast.LENGTH_SHORT).show();
            }
    }
}



