


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

public class Calhasruf1  extends AppCompatActivity implements
        BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

    TextToSpeech t1;
    ImageView b1;

    private String[] images = {

            "http://batorecalhas.com.br/images/01.jpg",
            "http://batorecalhas.com.br/images/02.jpg",
            "http://batorecalhas.com.br/images/03.jpg"};

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
        setContentView(R.layout.calhasruf1);

        b1 = (ImageView) findViewById(R.id.btnaudio);



        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Calhasruf1.this);
        aux1.description("Pescarias Emocionantes");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Calhasruf1.this);
        aux1.setOnImageLoadListener(Calhasruf1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Calhasruf1.this);
        aux1.description("Aprenda a Pescar Conosco");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Calhasruf1.this);
        aux1.setOnImageLoadListener(Calhasruf1.this);
        slImages.addSlider(aux1);

        DefaultSliderView aux2 = new DefaultSliderView(Calhasruf1.this);
        aux2.image(R.drawable.image_1);
        aux2.setOnSliderClickListener(Calhasruf1.this);
        aux2.description("1");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Calhasruf1.this);
        aux2.description("Os Maiores Peixes com Caiaque");
        aux2.image(R.drawable.image_2);
        aux2.setOnSliderClickListener(Calhasruf1.this);
        aux2.description("2");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Calhasruf1.this);
        aux2.image(R.drawable.image_3);
        aux2.setOnSliderClickListener(Calhasruf1.this);
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

                String falar = "Batoré   Calhas\n" +
                        "Nossos serviços\n" +
                        "\n" +
                        "Visamos sempre qualidade e a satisfação de nossos clientes. Efetuamos instalações e reparos desde simples até o mais complexo.\n" +
                        "Manutenção preventiva, assim evitando maiores gastos para nossos clientes.\n" +
                        "\n" +
                        "FABRICAÇão\n" +
                        "Fabricamos Calhas, Rufos, Etlicos, Dutos Condutores Retangulares, Curvas Galvanizadas de Aluminio Inox com material de primeira e com as melhores maquinas do mercado.\n" +
                        "\n" +
                        " VENDAS\n" +
                        "Vendemos todos os tamanhos de peças, de acordo com a solicitação dos clientes, tanto para residencias até empresas, oferecendo os melhores preçoos com qualidade.\n" +
                        "INSTALAÇÃO\n" +
                        "Instalamos de acordo com as necessidades dos clientes, visando sempre a qualidade, satisfação e agilidade.\n" +
                        "REPAROS\n" +
                        "Efetuamos desde o simples reparo até o mais complexo. Manutenção preventiva, assim evitando maiores gastos para nossos clientes.\n" +
                        "\n" +
                        "Entre em contato conosco\n" +
                        "Horário de Funcionamento \n" +
                        "De segunda  a sexta feira \n" +
                        " das 8:00 Hs ás 18:00 \n" +
                        "Sábado das 8:00 Hs  ás14:00 \n" +
                        "Av. Raimundo Pereira de Magalhões, - nº 6602 \n" +
                        "Pirituba -  Sao Paulo - SP. " +
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


