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

public class SanteAcademia  extends AppCompatActivity implements
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

            "https://scontent.fcgh11-1.fna.fbcdn.net/v/t1.0-9/27657335_1598626173562765_5395854926367496882_n.jpg?oh=0e769bde779552de9086050121587975&oe=5B0FAD0B",
            "https://scontent.fcgh11-1.fna.fbcdn.net/v/t1.0-9/27658033_1600589613366421_5936910160296650918_n.jpg?oh=3f2183ac1c28282790c57500e18bb0d9&oe=5B0B2E41",
            "https://scontent.fcgh11-1.fna.fbcdn.net/v/t1.0-9/26994031_1591108687647847_9001533468204012916_n.jpg?oh=9da7afb7f854eebb6e301a0b3759ec47&oe=5B0C6E16"};



    private SliderLayout slImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.sante_academia);

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
                if (ActivityCompat.checkSelfPermission(SanteAcademia.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(SanteAcademia.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


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
                if (ActivityCompat.checkSelfPermission(SanteAcademia.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(SanteAcademia.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


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

                Toast.makeText(SanteAcademia.this,"VALEZI & GARCIA não disponibilizou whatsapp", Toast.LENGTH_SHORT).show();

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

        TextSliderView aux1 = new TextSliderView(SanteAcademia.this);
        aux1.description("Saude e Bem Estar");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(SanteAcademia.this);
        aux1.setOnImageLoadListener(SanteAcademia.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(SanteAcademia.this);
        aux1.description("Sante Academia");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(SanteAcademia.this);
        aux1.setOnImageLoadListener(SanteAcademia.this);
        slImages.addSlider(aux1);

        TextSliderView aux2 = new TextSliderView(SanteAcademia.this);
        aux2.image(R.drawable.sante1);
        aux2.setOnSliderClickListener(SanteAcademia.this);
        aux2.description("Academia localizada na zona norte de São Paulo");
        slImages.addSlider(aux2);

        aux2 = new TextSliderView(SanteAcademia.this);
        aux2.description("Saúde e Bem Estar");
        aux2.image(R.drawable.sante2);
        aux2.setOnSliderClickListener(SanteAcademia.this);
        slImages.addSlider(aux2);

        aux2 = new TextSliderView(SanteAcademia.this);
        aux2.image(R.drawable.sante3);
        aux2.setOnSliderClickListener(SanteAcademia.this);
        aux2.description("");
        slImages.addSlider(aux2);

        aux2 = new TextSliderView(SanteAcademia.this);
        aux2.description("");
        aux2.image(R.drawable.sante4);
        aux2.setOnSliderClickListener(SanteAcademia.this);
        slImages.addSlider(aux2);


        aux2 = new TextSliderView(SanteAcademia.this);
        aux2.description("Os Maiores Peixes com Caiaque");
        aux2.image(R.drawable.sante5);
        aux2.setOnSliderClickListener(SanteAcademia.this);
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

                String falar = "Academia Santé e Bem Estar.\n" +
                        "Conte com a melhor academia da zona norte de São Paulo.\n" +
                        "\n" +
                        "Aqui nos temos tudo oque você precisa para sua saúde e bem estar.\n" +
                        "\n" +
                        "Saiba as vantagens de ser nosso cliente:\n" +
                        "Treinamento funcional.\n" +
                        "Acompanhamento de resultados.\n" +
                        "Bistrô Santé.\n" +
                        "Grupo de Corrida.\n" +
                        "Avaliação fisica computadorizada.\n" +
                        "Salão de cabeleleiro.\n" +
                        "Centro de Lutas.\n" +
                        "Aulas variadas de dança.\n" +
                        "Padrão internacional de aulas coletivas.\n" +
                        "Internet WIFI.\n" +
                        "Ar condicionado.\n" +
                        "Nutricionista.\n" +
                        "Podóloga.\n" +
                        "Studio de Pilates.\n" +
                        "Valet gratuito.\n" +

                        "Você ainda tem dúvidas ?\n" +
                        "\n"+
                        "Planos a partir de R$ 99,00.\n" +

                        "Entre em contato conosco, no telefone:011 2362 4887.\n" +
                        " Repetindo 011 2362 4887 .\n" +
                        "Venha até nós fazer uma visita, nosso endereço é; Rua Leonardo, nº 70 na Freguesia do Ó,    São Paulo. " +
                        "Nossas redes sociais são Facebook com nome de AcademiaSanté; e nosso instagram é academiasante \n"+
                        "Aguardamos a sua presença! "+
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
