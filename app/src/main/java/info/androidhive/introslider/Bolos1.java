


 package info.androidhive.introslider;

         import android.content.Intent;
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

public class Bolos1  extends AppCompatActivity implements
        BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

    TextToSpeech t1;
    ImageView b1;
    ImageView b2;

    private String[] images = {

            "http://www.casadebolos.com.br/media/uploads/nossa-historia-1.jpg",
            "http://www.casadebolos.com.br/media/uploads/nossa-historia.jpg",
            "http://www.casadebolos.com.br/media/novidades_post/bolo008_5.jpeg.580x360_q85_crop_upscale.jpg"};

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
        setContentView(R.layout.bolos1);

        b1 = (ImageView) findViewById(R.id.btnaudio);

        ImageView agulha = (ImageView) findViewById(R.id.irSite);
        agulha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnint = new Intent(getApplicationContext(),CasadeboloSite.class);
                startActivity(btnint);
            }

        });




        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Bolos1.this);
        aux1.description("Temos mais de 60 opções de bolo.");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Bolos1.this);
        aux1.setOnImageLoadListener(Bolos1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Bolos1.this);
        aux1.description("Melhores Bolos Caseiros do Brasil");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Bolos1.this);
        aux1.setOnImageLoadListener(Bolos1.this);
        slImages.addSlider(aux1);

        DefaultSliderView aux2 = new DefaultSliderView(Bolos1.this);
        aux2.image(R.drawable.bolo1);
        aux2.setOnSliderClickListener(Bolos1.this);
        aux2.description("1");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Bolos1.this);
        aux2.description("Uma Historia de Sucesso");
        aux2.image(R.drawable.bolo2);
        aux2.setOnSliderClickListener(Bolos1.this);
        aux2.description("2");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Bolos1.this);
        aux2.image(R.drawable.bolo4);
        aux2.setOnSliderClickListener(Bolos1.this);
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

                String falar = "casa de bolos\n" +
                        "Bolos caseirs - feitos com carinho.\n" +
                        "\n" +
                        "http://www.casadebolos.com.br/novidades/noticias/lancamento-de-mais-6-deliciosos-bolos-caseiros/\n" +
                        "A maior franquia de bolos caseiros do país.\n" +
                        "\n" +
                        "Uma História de Sucesso\n" +
                        "Do interior de São Paulo para todo Brasil. Os bolos caseiros da Vó Sônia encantaram o público e estão cada vez mais presentes na mesa da família brasileira. \n" +
                        "Receitas tradicionais indispensáveis para quem preza pela qualidade e pelo sabor de lembranças que são realmente importantes.\n" +
                        "\n" +
                        "Sinta-se em casa! Conheça nossos sabores e experimente a tradição do bolo caseiro feito com muito carinho. \n" +
                        "Temos mais de 60 opoções de bolos incluindo.\n" +
                        "Bolos Diet Integral - Bolos sem Glúten - Bolos sem lactose.\n" +
                        "\n" +
                        "Produção diária, sem adição de conservantes. \n" +
                        "\n" +
                        "Uma História de Sucesso\n" +
                        "Do interior de São Paulo para todo Brasil. Os bolos caseiros da Vó Sônia encantaram o público e estão cada vez mais presentes na mesa da família brasileira. \n" +
                        "Receitas tradicionais indispensáveis para quem preza pela qualidade e pelo sabor de lembranças que são realmente importantes.\n" +
                        "\n" +
                        "Sinta-se em casa! Conheça nossos sabores e experimente a tradição do bolo caseiro feito com muito carinho. \n" +
                        "\n" +
                        "Faça sua encomenda.\n" +
                        "\n" +
                        "Venha nos fazer uma visita.\n" +
                        "na Avenida Itaberaba  -  nº1587 - Nossa senhora do ó.\n" +
                        "São paulo.\n" +
                        "Ligue para \n" +
                        "onze - 3976-2015 .\n" +
                        "Temos estacionamento no local.\n" +
                        "\n" +
                        "Funcionamos de Segunda á sexta das 08H30 á 19H00 Min.\n" +
                        "Sábado as 08H30Min á 18H00Min.\n" +
                        "\n" +
                        "Acesse nosso facebook como Casa - de - bolos - franquia.\n" +
                        "E tambem acesse o nosso site em www.casadebolos.com.br. " +
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


