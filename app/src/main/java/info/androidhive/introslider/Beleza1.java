


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
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.Locale;

public class Beleza1  extends AppCompatActivity implements
        BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

    TextToSpeech t1;
    ImageView b1;

    private String[] images = {


            "http://macdepilacao.agtalisma.wepress.com.br/wp-content/uploads/sites/165/2015/01/01-Cabelos.jpg",
            "https://resource.wepress.com.br/www.macdepilacao.com.br/wp-content/uploads/sites/165/2017/10/Maquiagem-03.jpg",
            "https://resource.wepress.com.br/www.macdepilacao.com.br/wp-content/uploads/sites/165/2017/10/Manicure-e-Pedicure.jpg",
            "http://macdepilacao.agtalisma.wepress.com.br/wp-content/uploads/sites/165/2015/01/home_spa_section_boxes_img.png"};

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
        setContentView(R.layout.beleza1);


       b1 = (ImageView) findViewById(R.id.btnaudio);



        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Beleza1.this);
        aux1.description("manicure, pedicure, podologia, estética, depilação, cabelos, maquiagem");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Beleza1.this);
        aux1.setOnImageLoadListener(Beleza1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Beleza1.this);
        aux1.description("Mac Depilação está há mais de 20 anos no ramo de beleza");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Beleza1.this);
        aux1.setOnImageLoadListener(Beleza1.this);
        slImages.addSlider(aux1);
        aux1 = new TextSliderView(Beleza1.this);
        aux1.description("PRESENTE NOS MELHORES MOMENTOS DE SUA VIDA");
        aux1.image(images[2]);
        aux1.setOnSliderClickListener(Beleza1.this);
        aux1.setOnImageLoadListener(Beleza1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Beleza1.this);
        aux1.description("Salão de Beleza na Zona Norte | Salão de Cabeleireiro na Freguesia do Ó");
        aux1.image(images[3]);
        aux1.setOnSliderClickListener(Beleza1.this);
        aux1.setOnImageLoadListener(Beleza1.this);
        slImages.addSlider(aux1);
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

                String falar = "A Mac Depilação \n" +
                        "Serviços de manicure, pedicure, podologia, estética, depilação, cabelos, maquiagem\n" +
                        "\n" +
                        "\n" +
                        "A Mac Depilação está há mais de 20 anos no ramo de beleza, exercendo serviços de alta qualidade,\n" +
                        " com profissionais experientes e qualificados, para garantir a satisfação de nossas clientes, \n" +
                        "trazendo inovação, bem-estar e saúde. Nossos serviços são realizados com todo o cuidado, \n" +
                        "para manter a segurança das clientes, realçando sempre sua beleza.\n" +
                        "\n" +
                        "Salão de Beleza na Zona Norte | Salão de Cabeleireiro na Freguesia do Ó\n" +
                        "\n" +
                        "Mais de 30 anos cuidando da sua beleza e bem estar. Nossos principais serviços se resumem em depilação,\n" +
                        " cabelos, manicure e pedicure, podologia, estética, dia da noiva e micropigmentação.\n" +
                        "Ambiente agradável, higienizado e familiar, ótimo atendimento, profissionais capacitados, \n" +
                        "com ar condicionado, autoclave, produtos descartáveis, além de convênio com o estacionamento.\n" +
                        " \n" +
                        "Formas de pagamentos\n" +
                        "aceitamos os cartões de bandeira  visa - mastercard - Diners Club international e rede shop.\n" +
                        "\n" +
                        "AGENDE A SUA VISITA\n" +
                        "Entre em contato conosco e agende uma visita, contamos com excelentes profissionais para atender você!\n" +
                        "\n" +
                        "Telefones \n" +
                        "(11) 3935-3307\n" +
                        "ou (11) 3935-3033\n" +
                        " WhasApp - (11) 98704-0501\n" +
                        "\n" +
                        "Horário\n" +
                        "De terça-feira à sexta-feira das 9h às 19h – Aos sábados das 9h às 18h\n" +
                        "\n" +
                        "Endereço\n" +
                        "Endereço: Rua Bica, 303, Freguesia Do Ó – 02925-000 – São Paulo – SP\n" +
                        "\n" +
                        "Nosso emal E-mail é\n" +
                        "macdepilacao@terra.com.br\n" +
                        "\n" +
                        "e nosso site é www. macdepilacao.com.br\n" +
                        "\n" +
                        "\n" +
                        "A Mac Depilação \n. " +
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


