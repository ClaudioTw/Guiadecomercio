package info.androidhive.introslider;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.Locale;

public class Advocacia1  extends AppCompatActivity implements
        BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

    TextToSpeech t1;
    ImageView b1;
    Button btnCall2;
    Button btnCall;
    EditText nunTxt;
    ImageView btnFace;
    ImageView bntGoogle;
    ImageView bntInstagram;
    ImageView btnWhats;
    ImageView btnEmail;

    private String[] images = {

            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWcyri00dJWBM91cXYBmxaBb62N2SIS33BbhMe5BgSSH2qi1NO",
            "http://trabalhadores.org.br/wp-content/uploads/2017/02/trabalhista.jpg",
            "http://souzaadv.com.br/wp-content/uploads/2014/12/souzaadv-direito-civel-site-souzaadv.jpg"};



    private SliderLayout slImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.advocacia1);

        b1 = (ImageView) findViewById(R.id.btnaudio);
        nunTxt = (EditText) findViewById(R.id.idNumtxt);
        btnCall = (Button) findViewById(R.id.idbtnCall);
        btnCall2 = (Button) findViewById(R.id.idbtnCall2);
        btnFace = (ImageView) findViewById(R.id.imageView5);
        bntGoogle = (ImageView) findViewById(R.id.imageView6);
        bntInstagram = (ImageView) findViewById(R.id.imageView);
        btnWhats = (ImageView) findViewById(R.id.imageView7);
        btnWhats = (ImageView) findViewById(R.id.imageView7);
        btnEmail = (ImageView) findViewById(R.id.ideMaill);


        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numero = nunTxt.getText().toString();
                Uri uri = Uri.parse("tel:" + 39981452);


                Intent intent;
                intent = new Intent(Intent.ACTION_CALL, uri);
                if (ActivityCompat.checkSelfPermission(Advocacia1.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Advocacia1.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


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

        btnCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numero = nunTxt.getText().toString();
                Uri uri = Uri.parse("tel:" + 39929601);


                Intent intent;
                intent = new Intent(Intent.ACTION_CALL, uri);
                if (ActivityCompat.checkSelfPermission(Advocacia1.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Advocacia1.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


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
        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.facebook.com"));
                startActivity(intent);
            }
        });

        bntGoogle .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.plus.google.com/u/o/"));
                startActivity(intent);
            }
        });

        bntInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.instagram.com"));
                startActivity(intent);

            }
        });

        btnWhats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Advocacia1.this,"VALEZI & GARCIA não disponibilizou whatsapp", Toast.LENGTH_SHORT).show();

            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("email"));
                String[] s ={"teste@gmail.com"};
                i.putExtra(Intent.EXTRA_EMAIL,s);
                i.putExtra(Intent.EXTRA_SUBJECT, "Este é um teste");
                i.putExtra(Intent.EXTRA_TEXT,"Ola eu sou o corpo de seu email");
                i.setType("message /rf822");
                Intent chooser = Intent.createChooser(i,"Enviar Email");
                startActivity(chooser);
            }

        });

            // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Advocacia1.this);
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Advocacia1.this);
        aux1.setOnImageLoadListener(Advocacia1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Advocacia1.this);
        aux1.description("DIREITO TRABALHISTA");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Advocacia1.this);
        aux1.setOnImageLoadListener(Advocacia1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Advocacia1.this);
        aux1.description("DIREITO CÍVIL");
        aux1.image(images[2]);
        aux1.setOnSliderClickListener(Advocacia1.this);
        aux1.setOnImageLoadListener(Advocacia1.this);
        slImages.addSlider(aux1);

        TextSliderView aux2 = new TextSliderView(Advocacia1.this);
        aux2.setOnSliderClickListener(Advocacia1.this);
        aux2.description("CALCULOS e CALCULOS TRABALHISTAS");
        aux2.image(R.drawable.advocacia2);
        slImages.addSlider(aux2);

        aux2 = new TextSliderView(Advocacia1.this);
        aux2.image(R.drawable.advo1);
        aux2.setOnSliderClickListener(Advocacia1.this);
        aux2.description("APOSENTADORIA");
        slImages.addSlider(aux2);

        aux2 = new TextSliderView(Advocacia1.this);
        aux2.description("AUXILIO DOENÇA");
        aux2.image(R.drawable.advocacia1);
        aux2.setOnSliderClickListener(Advocacia1.this);
        slImages.addSlider(aux2);

        aux2 = new TextSliderView(Advocacia1.this);
        aux2.description("VALEZI &amp; GARCIA");
        aux2.image(R.drawable.advogados);
        aux2.setOnSliderClickListener(Advocacia1.this);
        slImages.addSlider(aux2);

        //slImages.setPresetIndicator(SliderLayout.PresetIndicators.Right_Bottom);
        slImages.setCustomIndicator((PagerIndicator) findViewById(R.id.custom_indicator));
        //slImages.setDuration(4000);
        //slImages.setSliderTransformDuration(8000, null);
        slImages.setIndicatorVisibility(PagerIndicator.IndicatorVisibility.Invisible);

        PagerIndicator p = (PagerIndicator) findViewById(R.id.custom_indicator);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("LOG", "ID: " + v.getId());
            }
        });

        // LISTVIEW
        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.getDefault());
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String falar = "VALEZI E GARCIA. \n" +
                        "Advogados\n" +
                        "Dr.Issac Valezi Junior  - OAB/SP 140710.\n" +
                        "Ações trabalhista e Cíveis.\n" +
                        "\n" +
                        "Calculos e Consultas trabalhistas\n" +
                        "Aposentadoria e Auxilio Doença.\n" +
                        "\n" +


                        "Venha nos visitar, estaremos lhe aguardando em nossos escritorios, que ficam no endereço .\n" +

                        "Escritório Estação Lapa .\n" +

                        "Rua: Wiliam Speers, nº 726.\n" +

                        "Entre em contato conosco no telefone:.\n" +

                        "3617-3003 ou ligue 3617-3005 .\n" +
                        "Repetindo.\n" +
                        "3617-3003 ou ligue 3617-3005 .\n" +

                        "Também temos o escritorio shopping pirituba.\n" +
                        "Av. Guerino Giovani Leardini, nº 53.\n" +
                        "Pirituba (ao lado do shopping pirituba .\n" +

                        "Entre em contato conosco no telefone:.\n" +

                        "3998-1452 ou ligue 3992-9601.\n" +
                        "Repetindo.\n" +
                        "3998-1452 ou ligue 3992-9601.\n" +
                        " " +
                        ""
                                .toString();
                Toast.makeText(getApplicationContext(), falar, Toast.LENGTH_SHORT).show();
                t1.speak(falar, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void onPause() {
        if (t1 != null) {
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }


    @Override
    public void onSliderClick(BaseSliderView baseSliderView) {
        Log.i("LOG", "onSliderClick(" + baseSliderView.getDescription() + ")");
        slImages.startAutoCycle();
    }

    @Override
    public void onStart(BaseSliderView baseSliderView) {
        Log.i("LOG", "onStart(" + baseSliderView.getDescription() + ")");
    }

    @Override
    public void onEnd(boolean b, BaseSliderView baseSliderView) {
        Log.i("LOG", "onEnd(" + baseSliderView.getDescription() + ")");


    }


}

