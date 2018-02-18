package info.androidhive.introslider;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AcademiaGrupo extends AppCompatActivity {
    Button btnCall;
    String sNum;
    EditText nunTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.academia_grupo);

        nunTxt = (EditText) findViewById(R.id.idNumtxt);
        btnCall = (Button) findViewById(R.id.idbtnCall);
        btnCall = (Button) findViewById(R.id.idbtnCall);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numero = nunTxt.getText().toString();
                Uri uri = Uri.parse("tel:" + 999963216);


                Intent intent;
                intent = new Intent(Intent.ACTION_CALL, uri);
                if (ActivityCompat.checkSelfPermission(AcademiaGrupo.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(AcademiaGrupo.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(intent);
            }

        });
    }

}
