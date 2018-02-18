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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.Locale;

public class Aquecedorsolar1  extends AppCompatActivity implements
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

    Button btnMapa;
    ImageView btnSite;

    private String[] images = {

            "http://static.mybookcard.com/Content/uploads/static/710c48bf3edf4209bfac00e7c56f6426/_imgs/73aff3d5_1423_4d3d_8f4d_f904a775397f.jpeg",
            "http://static.mybookcard.com/Content/uploads/static/710c48bf3edf4209bfac00e7c56f6426/_imgs/4d94eeda_4ff7_4d15_846a_99ed92f017b2.jpeg",
            "https://i.ytimg.com/vi/PoknRc6WBXo/hqdefault.jpg"};



    private SliderLayout slImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aquecedorsolar1);

         btnMapa = (Button) findViewById(R.id.idbtnMapa) ;
         btnSite = (ImageView)findViewById(R.id.idSite);

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
                if (ActivityCompat.checkSelfPermission(Aquecedorsolar1.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Aquecedorsolar1.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


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
                if (ActivityCompat.checkSelfPermission(Aquecedorsolar1.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Aquecedorsolar1.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


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

                Toast.makeText(Aquecedorsolar1.this,"VALEZI & GARCIA não disponibilizou whatsapp", Toast.LENGTH_SHORT).show();

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

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aquecedorsolar1.this, Mapa.class);
                startActivity(intent);

            }
        });

        btnSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://\"www.absolutaprotecao.com.br"));
                startActivity(intent);

            }
        });

        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Aquecedorsolar1.this);
        aux1.description("Pescarias Emocionantes");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Aquecedorsolar1.this);
        aux1.setOnImageLoadListener(Aquecedorsolar1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Aquecedorsolar1.this);
        aux1.description("Aprenda a Pescar Conosco");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Aquecedorsolar1.this);
        aux1.setOnImageLoadListener(Aquecedorsolar1.this);
        slImages.addSlider(aux1);

        DefaultSliderView aux2 = new DefaultSliderView(Aquecedorsolar1.this);
        aux2.image(R.drawable.aquecedorsolar);
        aux2.setOnSliderClickListener(Aquecedorsolar1.this);
        aux2.description("1");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Aquecedorsolar1.this);
        aux2.description("Os Maiores Peixes com Caiaque");
        aux2.image(R.drawable.image_2);
        aux2.setOnSliderClickListener(Aquecedorsolar1.this);
        aux2.description("2");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Aquecedorsolar1.this);
        aux2.image(R.drawable.image_3);
        aux2.setOnSliderClickListener(Aquecedorsolar1.this);
        aux2.description("3");
        slImages.addSlider(aux1);
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

                String falar = "AQUECEDOR SOLAR PARA PISCINAS.\n" +
                        "Instalação de Aquecedor Solar para Piscinas.\n" +
                        "Trabalhamos com:\n" +
                        "Limpeza e Conservação.\n" +
                        "Limpeza e desinfecção de reservatórios e caixas d'água.\n" +
                        "Limpeza de poços de água servida.\n" +
                        "Limpeza de tapetes, carpetes e estofamentos.\n" +
                        "Limpeza de Calhas.\n" +
                        "Controle de pragas em jardins, parques e terrenos.\n" +
                        "Troca de areia de filtro de piscinas com revisão das crepinas(após um ano a areia não filtra, mais e a sujeira retorna a piscina.\n" +
                        "Entre em contato conosco.\n" +
                        "telefone onze - 3971-4758.\n" +
                        "ou\n" +
                        "onze -96911-3072 operadora vivo.\n" +
                        "ou\n" +
                        "onze - 98534-2155 operadora tim.\n" +
                        "ou\n" +
                        "onze - 97600-8745 operadora claro.\n" +
                        "Se preferir acesse nosso site. \n" +
                        "www.absolutaprotecao.com.br\n" +
                        "ou venha nos fazer uma visita no endereço.\n" +
                        "Av. Mutinga - nº356\n" +
                        "Pirituba São Paulo"

                        .toString();
                Toast.makeText(getApplicationContext(), falar, Toast.LENGTH_SHORT).show();
                t1.speak(falar, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
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


