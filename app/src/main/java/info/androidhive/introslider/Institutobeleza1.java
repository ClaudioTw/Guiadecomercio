

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

public class Institutobeleza1  extends AppCompatActivity implements
        BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

    TextToSpeech t1;
    ImageView b1;

    private String[] images = {

            "https://resource.wepress.com.br/www.macdepilacao.com.br/wp-content/uploads/sites/165/2017/10/Est%C3%A9tica-03.jpg",
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
        setContentView(R.layout.institutobeleza1);

        b1 = (ImageView) findViewById(R.id.btnaudio);



        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Institutobeleza1.this);
        aux1.description("manicure, pedicure, podologia, estética, depilação, cabelos, maquiagem");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Institutobeleza1.this);
        aux1.setOnImageLoadListener(Institutobeleza1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Institutobeleza1.this);
        aux1.description("Mac Depilação está há mais de 20 anos no ramo de beleza");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Institutobeleza1.this);
        aux1.setOnImageLoadListener(Institutobeleza1.this);
        slImages.addSlider(aux1);
        aux1 = new TextSliderView(Institutobeleza1.this);
        aux1.description("PRESENTE NOS MELHORES MOMENTOS DE SUA VIDA");
        aux1.image(images[2]);
        aux1.setOnSliderClickListener(Institutobeleza1.this);
        aux1.setOnImageLoadListener(Institutobeleza1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Institutobeleza1.this);
        aux1.description("Salão de Beleza na Zona Norte | Salão de Cabeleireiro na Freguesia do Ó");
        aux1.image(images[3]);
        aux1.setOnSliderClickListener(Institutobeleza1.this);
        aux1.setOnImageLoadListener(Institutobeleza1.this);
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

                String falar = "Nome Popular Anchova, Enchova/Bluefish\n" +
                        "Nome Científico Pomatomus saltator\n" +
                        "Família Pomatomidae\n" +
                        "Distribuição Geográfica Regiões Norte, Nordeste, Sudeste e Sul (do Amapá ao Rio Grande do Sul). Mais comum do Rio de Janeiro a Santa Catarina.\n" +
                        "\n" +
                        "Descrição\n" +
                        "Peixe de escamas; o corpo é alongado, fusiforme e comprimido; a cabeça é grande e a boca larga com a mandíbula saliente; os dentes são afiados. A coloração é azulada no dorso e prateada nos flancos e ventre. Pode alcançar 1,5m de comprimento total e 20kg.\n" +
                        "Ecologia\n" +
                        "Espécie pelágica; costuma se aproximar da costa nos meses de inverno, época em que forma cardumes. Os indivíduos jovens formam grandes cardumes, mas, a medida que crescem, tendem a se isolar. Na época reprodutiva, os cardumes migram para o alto mar, para fora da plataforma continental, onde desovam. As anchovas freqüentam as águas agitadas das regiões mais profundas dos costões rochosos que se projetam para dentro do mar, onde ficam a espera das presas. É um peixe altamente voraz, atacando inclusive indivíduos da mesma espécie. É um dos peixes marinhos mais procurados pelos pescadores esportivos, e também tem importância comercial.\n" +
                        "Equipamentos As varas devem ser do tipo médio/pesado, uma vez que podem ser capturados exemplares de grande porte. As linhas devem ser de 20 lb a 30 lb.\n" +
                        "Iscas A pesca com isca artificial é mais emocionante, e, nesse caso, pode-se usar plugs de superfície, meia água, colheres, jigs, metais jigs e as famosas lambretas, que devem ser trabalhadas de forma rápida para que o movimento atraia as anchovas. Na pesca com iscas naturais, como sardinha, parati e tainha, é recomendável o uso de empate de aço.\n" +
                        "Dicas Por freqüentar águas agitadas, é uma espécie que tem muita força. Para se capturar um indivíduo de porte regular (mais de 5kg) é preciso muita briga porque o peixe não se entrega facilmente. Como costuma correr bastante, também é preciso ter muita linha à disposição. A pescaria de arremesso junto aos costões é mais eficiente. A captura é mais fácil nas marés de vazante das luas cheia e nova. " +
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


