

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

public class Cacavaza1  extends AppCompatActivity implements
        BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

    TextToSpeech t1;
    ImageView b1;

    private String[] images = {

            "https://i.ytimg.com/vi/Fxac9DR1X2E/maxresdefault.jpg",
            "https://lh3.googleusercontent.com/proxy/u9UokSDJwHPiMp_HSG_vEU7lVukq0EPKhET19fH4-m_Cx3DixF4zG9AW4YPI22IXwmSrK2yfScD3xLON0bJqN-BbQA=w530-h298-n",
            "https://i.ytimg.com/vi/PoknRc6WBXo/hqdefault.jpg"};

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
        setContentView(R.layout.cacavaza1);

        b1 = (ImageView) findViewById(R.id.btnaudio);



        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Cacavaza1.this);
        aux1.description("Pescarias Emocionantes");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Cacavaza1.this);
        aux1.setOnImageLoadListener(Cacavaza1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Cacavaza1.this);
        aux1.description("Aprenda a Pescar Conosco");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Cacavaza1.this);
        aux1.setOnImageLoadListener(Cacavaza1.this);
        slImages.addSlider(aux1);

        DefaultSliderView aux2 = new DefaultSliderView(Cacavaza1.this);
        aux2.image(R.drawable.image_1);
        aux2.setOnSliderClickListener(Cacavaza1.this);
        aux2.description("1");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Cacavaza1.this);
        aux2.description("Os Maiores Peixes com Caiaque");
        aux2.image(R.drawable.image_2);
        aux2.setOnSliderClickListener(Cacavaza1.this);
        aux2.description("2");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Cacavaza1.this);
        aux2.image(R.drawable.image_3);
        aux2.setOnSliderClickListener(Cacavaza1.this);
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

                String falar = "ESGOTÉCNICA\n" +
                        "\n" +
                        "Caça Vazamentos\n" +
                        "Procurando Caça Vazamentos?\n" +
                        "\n" +
                        "Nós somos  especialistas na detecção de vazamentos ocultos, utilizamos vários tipos de equipamentos adequados para cada ocasião.\n" +
                        "\n" +
                        "Saiba mais\n" +
                        "Caça Vazamentos em Esgotos\n" +
                        "Localizamos vazamentos em tubulações de até 10\" polegadas, e em extensões de linha de até 20 metros, tubulações de esgotos, águas pluviais, ramais de pias, saídas de vasos sanitários e etc.\n" +
                        "\n" +
                        "Saiba mais\n" +
                        "Caça Vazamentos de Infiltrações\n" +
                        "Localizamos qualquer infiltração que exista, por inspeção visual, nossos técnicos são treinados para fazer essa vistoria facilmente. Contrate hoje mesmo.\n" +
                        "\n" +
                        "Saiba mais\n" +
                        "REGIÕES DE ATENDIMENTO EM SÃO PAULO\n" +
                        "\n" +
                        "CAÇA VAZAMENTOS ZONA SUL\n" +
                        "CAÇA VAZAMENTOS ZONA NORTE\n" +
                        "CAÇA VAZAMENTOS ZONA OESTE\n" +
                        "CAÇA VAZAMENTOS ZONA LESTE\n" +
                        "\n" +
                        "Conheça a equipe\n" +
                        "Técnicos espalhados estão sempre prontos a te atender de forma rápida.\n" +
                        "\n" +
                        "Nossa frota de veículos, estão todas adesivadas para melhor identificação da empresa junto ao cliente.\n" +
                        "\n" +
                        "\n" +
                        "Ligue Agora!\n" +
                        " (011)3422-2030\n" +
                        "Ligue Agora!\n" +
                        " (011)95205-9366. " +
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



