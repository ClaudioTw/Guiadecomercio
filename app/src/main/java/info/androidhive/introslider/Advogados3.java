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

public class Advogados3  extends AppCompatActivity implements
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
            "http://advocaciamk.com.br/wp-content/uploads/2017/12/direito-civil-mk-advocacia.jpg"};



    private SliderLayout slImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.advogados3);


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
                Uri uri = Uri.parse("tel:" + 1139313633);


                Intent intent;
                intent = new Intent(Intent.ACTION_CALL, uri);
                if (ActivityCompat.checkSelfPermission(Advogados3.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Advogados3.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


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
                Uri uri = Uri.parse("tel:" + 1139312298);


                Intent intent;
                intent = new Intent(Intent.ACTION_CALL, uri);
                if (ActivityCompat.checkSelfPermission(Advogados3.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Advogados3.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


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

                Toast.makeText(Advogados3.this,"A não disponibilizou whatsapp", Toast.LENGTH_SHORT).show();

            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("email"));
                String[] s ={"adv.advogados@uol.com.br"};
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


        TextSliderView aux1 = new TextSliderView(Advogados3.this);
        aux1.description("Pescarias Emocionantes");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Advogados3.this);
        aux1.setOnImageLoadListener(Advogados3.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Advogados3.this);
        aux1.description("Aprenda a Pescar Conosco");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Advogados3.this);
        aux1.setOnImageLoadListener(Advogados3.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Advogados3.this);
        aux1.description("Aprenda a Pescar Conosco");
        aux1.image(images[2]);
        aux1.setOnSliderClickListener(Advogados3.this);
        aux1.setOnImageLoadListener(Advogados3.this);
        slImages.addSlider(aux1);

        TextSliderView aux2 = new TextSliderView(Advogados3.this);
        aux2.setOnSliderClickListener(Advogados3.this);
        aux2.description("Isso é um teste");
        aux2.image(R.drawable.advocacia2);
        slImages.addSlider(aux2);

        aux2 = new TextSliderView(Advogados3.this);
        aux2.image(R.drawable.advo1);
        aux2.setOnSliderClickListener(Advogados3.this);
        aux2.description("Isso é um teste 2");
        slImages.addSlider(aux2);

        aux2 = new TextSliderView(Advogados3.this);
        aux2.description("Os Maiores Peixes com Caiaque");
        aux2.image(R.drawable.advocacia1);
        aux2.setOnSliderClickListener(Advogados3.this);
        slImages.addSlider(aux2);

        aux2 = new TextSliderView(Advogados3.this);
        aux2.description("MOREIRA & DOMINGUES");
        aux2.image(R.drawable.advogados);
        aux2.setOnSliderClickListener(Advogados3.this);
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

                String falar = "MOREIRA & DOMINGUES\n" +
                        "Advogados.\n" +
                        "Rogerio Antonio Moreira - OAB/SP: 94.467.\n" +
                        "Leandro Hald Domingues - OAB/SP: 204.637\n" +
                        "Trabalhamos com.\n" +


                        "Direito cívil.\n" +
                        "indenização  \n" +
                        "dano moral.\n" +
                        "cobrança.\n" +

                        "DIREITO da família.\n" +

                        "divórcio.\n" +
                        "pensão alimenticia.\n" +
                        "inventário.\n" +
                        "DIREITO TRABALHISTA.\n" +
                        "ações - cálculos - acidende de trabalho.\n" +

                        ".\n" +

                        "Direito IMOBILIÁRIO:.\n" +
                        "posse - usucapião - condomínio e leilão.\n" +


                        "Direito PENAL.\n" +

                        "tribunal de júri - defesa - representação.\n" +
                        "Direito PREVIDENCIÁRIO.\n" +
                        "aposentadoria - pensão e auxilo doença.\n" +
                        "DIREITO IMOBILIÁRIO E CONDOMINAL.\n" +
                        "Assessoria jurídica em assembleias.\n" +
                        "Administração de condomínios.\n" +
                        "Emissão de notificação.\n" +
                        "Advertências e multas.\n" +
                        "Elaboração de registros de ATA de reuniões.\n" +
                        "Sindico profissional.\n" +

                        "Envie um email para nós.\n" +
                        "Email: adv.advogados@uol.com.br.\n" +

                        "Não perca tempo, entre em contato conosco.\n" +
                        "Ligue para onze- 3931-3633\n" +
                        "ou ligue para onze- 3931-2298\".\n" +
                        "Repetindo\".\n" +
                        "Ligue para onze- 3931-3633\n" +
                        "ou ligue para onze- 3931-2298\".\n" +

                        "MOREIRA & DOMINGUES\n" +


                        " " +
                        ""
                        + b1.getImageMatrix().toString();
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
