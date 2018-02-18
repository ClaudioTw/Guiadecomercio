package info.androidhive.introslider;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Academias extends AppCompatActivity {

    TextToSpeech t1;
    ImageView b1;
    ImageView b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academias);

        b1 = (ImageView) findViewById(R.id.fotoacademia);


        ImageView btnteste = (ImageView) findViewById(R.id.fotoacademia);
        btnteste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SanteAcademia.class);
                startActivity(i);
            }

        });
        ImageView btnteste1 = (ImageView) findViewById(R.id.foto3);
        btnteste1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuGuia.class);
                startActivity(i);
            }

        });






    }
    }

