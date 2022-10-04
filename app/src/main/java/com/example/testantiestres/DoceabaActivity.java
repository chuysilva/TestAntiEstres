package com.example.testantiestres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DoceabaActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView txt;
    private Button video1, video2, video3;
    private final static String VIDEO1_URL = "https://www.youtube.com/shorts/adpR2UQTElk";
    private final static String VIDEO2_URL = "https://www.youtube.com/watch?v=4T7oOd8EMf4";
    private final static String VIDEO3_URL = "https://www.youtube.com/watch?v=vit0Llvl9Gc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doceaba);

        txt = (TextView)findViewById(R.id.textView13);
        video1 = (Button)findViewById(R.id.button12);
        video2 = (Button)findViewById(R.id.button13);
        video3 = (Button)findViewById(R.id.button14);

        video1.setOnClickListener(this);
        video2.setOnClickListener(this);
        video3.setOnClickListener(this);

        int resultadofinal10 = getIntent().getIntExtra("resultadofinal10",0);
        txt.setText("" + resultadofinal10);
    }

    @Override public void onBackPressed() { }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch(view.getId()){
            case R.id.button12:
                    intent.setData(Uri.parse(VIDEO1_URL));
                    startActivity(intent);
                    break;
            case R.id.button13:
                intent.setData(Uri.parse(VIDEO2_URL));
                startActivity(intent);
                break;
            case R.id.button14:
                intent.setData(Uri.parse(VIDEO3_URL));
                startActivity(intent);
                break;
        }
    }
}