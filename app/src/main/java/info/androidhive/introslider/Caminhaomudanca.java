package info.androidhive.introslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Caminhaomudanca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caminhaomudanca);
        ImageView btnteste = (ImageView) findViewById(R.id.caminhaomudancas);
        btnteste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Caminhaomudanca1.class);
                startActivity(i);
            }

        });

    }
}
