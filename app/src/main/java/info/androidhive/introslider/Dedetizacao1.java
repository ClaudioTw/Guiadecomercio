

 package info.androidhive.introslider;

         import android.os.Bundle;
         import android.speech.tts.TextToSpeech;
         import android.support.v7.app.AppCompatActivity;
         import android.util.Log;
         import android.view.View;
         import android.widget.ImageView;
         import android.widget.Toast;

         import com.daimajia.slider.library.Indicators.PagerIndicator;
         import com.daimajia.slider.library.SliderLayout;
         import com.daimajia.slider.library.SliderTypes.BaseSliderView;
         import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
         import com.daimajia.slider.library.SliderTypes.TextSliderView;

         import java.util.Locale;

public class Dedetizacao1  extends AppCompatActivity implements
        BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

    TextToSpeech t1;
    ImageView b1;

    private String[] images = {

            "http://static.mybookcard.com/Content/uploads/static/710c48bf3edf4209bfac00e7c56f6426/_imgs/264da1e3_cc65_4705_8dba_84cc38a6803f.png",
            "http://static.mybookcard.com/Content/uploads/static/710c48bf3edf4209bfac00e7c56f6426/_imgs/04e9d053_5c6d_4e32_8fdd_4b2a321fd17f.png",
            "http://static.mybookcard.com/Content/uploads/static/710c48bf3edf4209bfac00e7c56f6426/_imgs/0a49092a_c023_4762_a2c6_b20ba947f1f0.png"};

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
        setContentView(R.layout.dedetizacao1);

        b1 = (ImageView) findViewById(R.id.btnaudio);



        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Dedetizacao1.this);
        aux1.description("Desentupimento em Geral");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Dedetizacao1.this);
        aux1.setOnImageLoadListener(Dedetizacao1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Dedetizacao1.this);
        aux1.description("A proteção invisível de seu ambiente");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Dedetizacao1.this);
        aux1.setOnImageLoadListener(Dedetizacao1.this);
        slImages.addSlider(aux1);

        DefaultSliderView aux2 = new DefaultSliderView(Dedetizacao1.this);
        aux2.image(R.drawable.ddbras2);
        aux2.setOnSliderClickListener(Dedetizacao1.this);
        aux2.description("1");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Dedetizacao1.this);
        aux2.description("Os Maiores Peixes com Caiaque");
        aux2.image(R.drawable.ddb3);
        aux2.setOnSliderClickListener(Dedetizacao1.this);
        aux2.description("2");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Dedetizacao1.this);
        aux2.image(R.drawable.ddb5);
        aux2.setOnSliderClickListener(Dedetizacao1.this);
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

                String falar = "DD Brás Empresa de Dedetização Brasileira S/C LTDA\n" +
                        "Desentupimento em Geral\n" +
                        "\n" +
                        "Conheça nossos serviços e encontre a solução certa para o seu problema!\n" +
                        "\n" +
                        "\n" +
                        "PIAS - RALOS - SANITÁRIOS - TANQUES - ESGOTOS  - COLUNAS\n" +
                        "\n" +
                        "Desinsetização\n" +
                        "\n" +
                        "BARATAS - TRAÇAS - PULGAS  -CARRAPATOS \n" +
                        "FORMIGAS  - ARANHAS - E DEMAIS INSETOS\n" +
                        "\n" +
                        "Dedetização\n" +
                        "Especializada sem manchas, sem cheiro, imobilização por processos de micro-pulverização e\n" +
                        " gel com química de alto padrão anti-alérgica, hospitalar e com garantia e eficiência absoluta.\n" +
                        "\n" +
                        "Desratização\n" +
                        "\n" +
                        "CAMUNDONGOS - RATAZANAS - E RATOS DE ESGOTO\n" +
                        "Tudo com ASSISTÊNCIA MENSAL\n" +
                        "\n" +
                        "Descupinização\n" +
                        "\n" +
                        "BROCAS - CUPINS DE SOLO E MADEIRA\n" +
                        "Tratamento específico com garantia para cupins de madeira e de solo com barreira química.\n" +
                        "\n" +
                        "Repelente para Pombos - Por meio de gel fixador\n" +
                        "\n" +
                        "Não mata ,somente os espanta!\n" +
                        "Instalação de Aquecedor Solar para Piscinas\n" +
                        "\n" +
                        "Limpeza e conservação\n" +
                        "Entre em contato conosco.\n" +
                        "onze - 3672-9698\n" +
                        "ou onze -  3864-8841\n" +
                        "\n" +
                        "ou visite-nos na\n" +
                        "Rua Clélia, 1897,  Lapa\n" +
                        "São Paulo - SP - 05042001\n. " +
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


