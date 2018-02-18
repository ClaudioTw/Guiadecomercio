package info.androidhive.introslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Dedetizacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dedetizacao);
        ImageView btnteste = (ImageView) findViewById(R.id.dedetizacao);
        btnteste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Dedetizacao1.class);
                startActivity(i);
            }

        });
        ImageView btnteste2 = (ImageView) findViewById(R.id.foto2);
        btnteste2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Dedetizacao2.class);
                startActivity(i);
            }

        });


    }
}
