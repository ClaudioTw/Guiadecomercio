package info.androidhive.introslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ar_carro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_carro);
        ImageView btnteste = (ImageView) findViewById(R.id.arcarro);
        btnteste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ar_carro1.class);
                startActivity(i);
            }

        });

        ImageView btnteste1 = (ImageView) findViewById(R.id.foto3);
        btnteste1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ar_Carro2.class);
                startActivity(i);
            }

        });

    }
}
