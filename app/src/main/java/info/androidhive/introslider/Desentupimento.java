package info.androidhive.introslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Desentupimento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desentupimento);
        ImageView btnteste = (ImageView) findViewById(R.id.desentupimento1);
        btnteste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Desentupimento1.class);
                startActivity(i);
            }

        });

        ImageView btnteste2 = (ImageView) findViewById(R.id.desentupimento2);
        btnteste2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Desentupimento2.class);
                startActivity(i);
            }

        });
        ImageView btnteste3 = (ImageView) findViewById(R.id.desentupimento3);
        btnteste3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Desentupimento3.class);
                startActivity(i);
            }

        });
        ImageView btnteste4 = (ImageView) findViewById(R.id.desentupimento4);
        btnteste4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Desentupimento4.class);
                startActivity(i);
            }

        });
        ImageView btnteste5 = (ImageView) findViewById(R.id.desentupimento5);
        btnteste5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Desentupimento5.class);
                startActivity(i);
            }

        });

        ImageView btnteste6 = (ImageView) findViewById(R.id.desentupimento6);
        btnteste6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Desentupimento6.class);
                startActivity(i);
            }

        });
        ImageView btnteste7 = (ImageView) findViewById(R.id.desentupimento7);
        btnteste7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Desentupimento7.class);
                startActivity(i);
            }

        });
    }
}
