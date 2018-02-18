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

public class Advogados2  extends AppCompatActivity implements
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

            "http://www.certidoes.blog.br/calculo/wp-content/uploads/2013/10/C%C3%A1lculo-Trabalhista.jpg?x51815",
            "http://www.brasil.gov.br/cidadania-e-justica/2012/07/segurados-aptos-a-se-aposentarem-por-idade-em-agosto-sao-comunicados-via-carta/aposentadoria-por-idade/@@images/image.jpeg",
            "http://fisioteraloucos.com.br/wp-content/uploads/2015/06/Carteira_trabl.png"};



    private SliderLayout slImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.advogados2);

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
                if (ActivityCompat.checkSelfPermission(Advogados2.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Advogados2.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


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
                if (ActivityCompat.checkSelfPermission(Advogados2.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Advogados2.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


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

                Toast.makeText(Advogados2.this,"VALEZI & GARCIA não disponibilizou whatsapp", Toast.LENGTH_SHORT).show();

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

        TextSliderView aux1 = new TextSliderView(Advogados2.this);
        aux1.description("DIREITO TRABALHISTA");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Advogados2.this);
        aux1.setOnImageLoadListener(Advogados2.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Advogados2.this);
        aux1.description("DIREITO APOSENTADORIA");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Advogados2.this);
        aux1.setOnImageLoadListener(Advogados2.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Advogados2.this);
        aux1.description("CALCULOS e CALCULOS TRABALHISTAS");
        aux1.image(images[2]);
        aux1.setOnSliderClickListener(Advogados2.this);
        aux1.setOnImageLoadListener(Advogados2.this);
        slImages.addSlider(aux1);

        TextSliderView aux2 = new TextSliderView(Advogados2.this);
        aux2.setOnSliderClickListener(Advogados2.this);
        aux2.description("DIREITO CÍVIL");
        aux2.image(R.drawable.advocacia2);
        slImages.addSlider(aux2);

        aux2 = new TextSliderView(Advogados2.this);
        aux2.image(R.drawable.advo1);
        aux2.setOnSliderClickListener(Advogados2.this);
        aux2.description("A&N GUIMARÃES");
        slImages.addSlider(aux2);

        aux2 = new TextSliderView(Advogados2.this);
        aux2.description("AUXILIO DOENÇA");
        aux2.image(R.drawable.advocacia1);
        aux2.setOnSliderClickListener(Advogados2.this);
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

                String falar = "A&N GUIMARÃES. \n" +
                        "Acessoria Jurídica\n" +
                        "Advogados.\n" +
                        "Ações trabalhista e Cíveis.\n" +
                        "\n" +
                        "Previdenciaria\n" +
                        "Família do consumidor.\n" +
                        "Acessoria Jurídica para Empresas e Condomínios.\n" +
                        "\n" +


                        "Conculta gratuita e somente com hora marcada .\n" +

                        "\n" +

                       "Entre em contato conosco no telefone:.\n" +

                        "3981-4552 ou ligue 3982-3616  .\n" +
                        "Repetindo.\n" +
                        "3981-4552 ou ligue 3982-3616  .\n" +




                        "Freguesia do Ó.\n" +
                        "São Paulo.\n" +
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
