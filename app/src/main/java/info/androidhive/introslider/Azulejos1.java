

 package info.androidhive.introslider;

         import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
         import android.webkit.WebView;
         import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.Locale;

public class Azulejos1  extends AppCompatActivity implements
        BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

    TextToSpeech t1;
    ImageView b1;

    private String[] images = {

            "http://azulejosantigos.net.br/produtos/foto1/grande/015.jpg",
            "http://azulejosantigos.net.br/produtos/foto1/grande/008.jpg",
            "http://azulejosantigos.net.br/produtos/foto1/media/175.jpg"};

    private String[] effects = {"Pescaria de caiaques",
            "Background2Foreground",
            "CubeIn",
            "Default",
            "DepthPage",
            "Fade",
            "FlipHorizontal",
            "FlipPage",
            "Foreground2Background",
            "RotateDown",
            "RotateUp",
            "Stack",
            "Tablet",
            "ZoomIn",
            "ZoomOut",
            "ZoomOutSlide"};

    private SliderLayout.Transformer[] effectsId = {
            SliderLayout.Transformer.Accordion,
            SliderLayout.Transformer.Background2Foreground,
            SliderLayout.Transformer.CubeIn,
            SliderLayout.Transformer.Default,
            SliderLayout.Transformer.DepthPage,
            SliderLayout.Transformer.Fade,
            SliderLayout.Transformer.FlipHorizontal,
            SliderLayout.Transformer.FlipPage,
            SliderLayout.Transformer.Foreground2Background,
            SliderLayout.Transformer.RotateDown,
            SliderLayout.Transformer.RotateUp,
            SliderLayout.Transformer.Stack,
            SliderLayout.Transformer.Tablet,
            SliderLayout.Transformer.ZoomIn,
            SliderLayout.Transformer.ZoomOut,
            SliderLayout.Transformer.ZoomOutSlide};

    private SliderLayout slImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.azulejos1);

        final WebView webView = (WebView) findViewById(R.id.WebViewazulejo);

        webView.loadUrl("http://azulejosantigos.net.br");
        webView.getSettings().setJavaScriptEnabled(true);


        b1 = (ImageView) findViewById(R.id.btnaudio);





        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Azulejos1.this);
        aux1.description("Nós achamos o piso ou azulejo certo para você.");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Azulejos1.this);
        aux1.setOnImageLoadListener(Azulejos1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Azulejos1.this);
        aux1.description("Grandes estoques de cerâmicas antigas ou fora de linha");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Azulejos1.this);
        aux1.setOnImageLoadListener(Azulejos1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Azulejos1.this);
        aux1.description("Grandes estoques de cerâmicas antigas ou fora de linha");
        aux1.image(images[2]);
        aux1.setOnSliderClickListener(Azulejos1.this);
        aux1.setOnImageLoadListener(Azulejos1.this);
        slImages.addSlider(aux1);

        DefaultSliderView aux2 = new DefaultSliderView(Azulejos1.this);
        aux2.image(R.drawable.image_1);
        aux2.setOnSliderClickListener(Azulejos1.this);
        aux2.description("1");
        slImages.addSlider(aux2);



        aux2 = new DefaultSliderView(Azulejos1.this);
        aux2.description("Azulejo - Gyotoko - Grande estoque");
        aux2.image(R.drawable.image_2);
        aux2.setOnSliderClickListener(Azulejos1.this);
        aux2.description("2");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Azulejos1.this);
        aux2.image(R.drawable.image_3);
        aux2.setOnSliderClickListener(Azulejos1.this);
        aux2.description("3");
        slImages.addSlider(aux1);
        slImages.setPresetTransformer(effectsId[0]);
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

                String falar = "S e S Azulejos.\n" +
                        "\n" +
                        "Trabalhamos com Pisos - Azulejos - Fora de linha.\n" +
                        "Temos tudo parareposição - Compra e Venda.\n" +
                        "\n" +
                        "Venha nos fazer uma visita em nosso endereço matriz\n" +
                        "Rua Brigadeiro gavião peixoto - nº1419.\n" +
                        "Lapa.\n" +
                        "Fica no inicio da rua guaipá c/ a belmonte.\n" +
                        "Ligue no telefone .\n" +
                        "onze - 3645- 2168\n" +
                        "ou\n" +
                        "onze - 3645-0394\n" +
                        "\n" +
                        "loja 2.\n" +
                        "Rua clelia - nº421 - Lapa.\n" +
                        "onze - 3865-2539\n" +
                        "repetindo.\n" +
                        "onze - 3865-2539.\n" +
                        "\n" +
                        "loja3.\n" +
                        "Rua Samuel das neves - nº57 - bela vista.\n" +
                        "ligue no telefone:.\n" +
                        "onze - 3101-1781\n" +
                        "\n" +
                        "Se preferir envie uma mensagem para nos em nosso whatsapp.\n" +
                        "que é 95845-1288.\n" +
                        "\n" +
                        "Acesse  nosso site.\n" +
                        "www.azulejosantigos.net.br\n" +
                        "ou nos envie um email para\n" +
                        "\n" +
                        "comercial@azulejosantigos.net.br. " +
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


