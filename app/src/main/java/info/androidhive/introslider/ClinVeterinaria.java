package info.androidhive.introslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ClinVeterinaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clin_veterinaria);
        ImageView btnteste = (ImageView) findViewById(R.id.clinicanet);
        btnteste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ClinVeterinaria1.class);
                startActivity(i);
            }

        });

    }
}
