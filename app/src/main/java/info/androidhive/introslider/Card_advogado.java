package info.androidhive.introslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Card_advogado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_advogado);

        ImageView btnteste = (ImageView) findViewById(R.id.foto2);
        btnteste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Advocacia1.class);
                startActivity(i);
            }

        });



    ImageView sebot = (ImageView) findViewById(R.id.foto3);
        sebot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent ni = new Intent(getApplicationContext(), Advogados2.class);
            startActivity(ni);
        }

    });

        ImageView sebote = (ImageView) findViewById(R.id.foto4);
        sebote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ni = new Intent(getApplicationContext(), Advogados3.class);
                startActivity(ni);
            }

        });
}
}
