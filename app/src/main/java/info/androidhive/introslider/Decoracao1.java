

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

public class Decoracao1  extends AppCompatActivity implements
        BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

    TextToSpeech t1;
    ImageView b1;

    private String[] images = {

            "http://ctgdecoracoes.com.br/banner/04.png",
            "http://ctgdecoracoes.com.br/banner/05.png",
            "http://ctgdecoracoes.com.br/banner/06.png"};

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
        setContentView(R.layout.decoracao1);

        b1 = (ImageView) findViewById(R.id.btnaudio);



        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Decoracao1.this);
        aux1.description("Pescarias Emocionantes");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Decoracao1.this);
        aux1.setOnImageLoadListener(Decoracao1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Decoracao1.this);
        aux1.description("Aprenda a Pescar Conosco");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Decoracao1.this);
        aux1.setOnImageLoadListener(Decoracao1.this);
        slImages.addSlider(aux1);

        DefaultSliderView aux2 = new DefaultSliderView(Decoracao1.this);
        aux2.image(R.drawable.image_1);
        aux2.setOnSliderClickListener(Decoracao1.this);
        aux2.description("1");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Decoracao1.this);
        aux2.description("Os Maiores Peixes com Caiaque");
        aux2.image(R.drawable.image_2);
        aux2.setOnSliderClickListener(Decoracao1.this);
        aux2.description("2");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Decoracao1.this);
        aux2.image(R.drawable.image_3);
        aux2.setOnSliderClickListener(Decoracao1.this);
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

                String falar = " CTG Decorações\n" +
                        "\n" +
                        "FAZEMOS MANUTENÇÃO E LAVAGEM DE PERSIANAS\n" +
                        "\n" +
                        "Desde 2000\n" +
                        "Atingir a satisfação dos clientes com produtos e serviços de decorações \n" +
                        "com excelente padrões de qualidade e atendimento,\n" +
                        " visando um crescimento contínuo e sustentável.\n" +
                        "\n" +
                        "Com uma equipe capacitada e profissionais experientes, \n" +
                        "oferecemos tudo para decorar seu lar ou escritório com o requinte e \n" +
                        "bom gosto que você merece, a preços competitivos e especiais.\n" +
                        "\n" +
                        "\n" +
                        "Você esta precisando de:\n" +
                        "\n" +
                        "• Cortinas sob medida e vários modelos\n" +
                        "• Persianas sob medida e vários modelos\n" +
                        "• Persianas Rolo e Personalizadas\n" +
                        "• Papeis de Parede\n" +
                        "• Forros e Divisórias\n" +
                        "• Carpetes\n" +
                        "• Pisos Laminados, diversas marcas nacionais e importadas.\n" +
                        "• Pisos Decorflex,\n" +
                        "• Vinilico,\n" +
                        "• Tarkett Fademac\n" +
                        "• Paviflex e Pavifloor\n" +
                        "• Drywall\n" +
                        "\n" +
                        "E mais ! Quebrou – Sujou – Rasgou?\n" +
                        "\n" +
                        "• Manutenção e lavagem de cortinas e persianas\n" +
                        "\n" +
                        "Ligue para nós\n" +
                        "Telefones onze 3805-1975 \n" +
                        "ou onze - 2235- 6977\n" +
                        "\n" +
                        "Venha nos visitar na \n" +
                        "\n" +
                        "Avenida Itaberaba, nº 3427 \n" +
                        "Freguesia do Ó, São Paulo - SP \n" +
                        "\n" +
                        "Segunda à Sexta: 09:00 hs às 19:00 hs \n" +
                        "Sábados: 09:00 hs às 15:00 hs.\n" +
                        "Domingos e Feriados: FECHADO. " +
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


