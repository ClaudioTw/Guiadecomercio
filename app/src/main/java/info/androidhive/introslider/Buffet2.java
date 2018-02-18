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
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.Locale;

public class Buffet2  extends AppCompatActivity implements
        BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

    TextToSpeech t1;
    ImageView b1;

    private String[] images = {

            "http://www.eev.com.br/tudoparafestas/imagens/imgFotos560130.jpg",
            "http://www.eev.com.br/tudoparafestas/imagens/imgFotos560101.jpg",
            "http://www.eev.com.br/tudoparafestas/imagens/imgFotos560136.jpg",
            "http://www.eev.com.br/tudoparafestas/imagens/imgFotos559662.jpg",};

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
        setContentView(R.layout.buffet2);

        b1 = (ImageView) findViewById(R.id.btnaudio);


        final WebView webView = (WebView) findViewById(R.id.webViewatlants);

        webView.loadUrl("http://tudoparafestas.net/?area=album&pg=Plano+geral");
        webView.getSettings().setJavaScriptEnabled(true);






        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Buffet2.this);
        aux1.description("Promoshow & Atlantis - Festas - Feiras & Eventos Variados");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Buffet2.this);
        aux1.setOnImageLoadListener(Buffet2.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Buffet2.this);
        aux1.description("BRASIL PROMOSHOW E ATLANTIS BUFFET");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Buffet2.this);
        aux1.setOnImageLoadListener(Buffet2.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Buffet2.this);
        aux1.description("PRESENTE NOS MELHORES MOMENTOS DE SUA VIDA");
        aux1.image(images[2]);
        aux1.setOnSliderClickListener(Buffet2.this);
        aux1.setOnImageLoadListener(Buffet2.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Buffet2.this);
        aux1.description("Qualidade, Visual e Respeito com o cliente");
        aux1.image(images[3]);
        aux1.setOnSliderClickListener(Buffet2.this);
        aux1.setOnImageLoadListener(Buffet2.this);
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

                String falar = "Promoshow & Atlantis - Festas - Feiras & Eventos Variados.\n" +
                        "BRASIL PROMOSHOW E ATLANTIS BUFFET.\n" +
                        "PRESENTE NOS MELHORES MOMENTOS DE SUA VIDA.\n" +
                        "\n" +
                        "\n" +
                        "Temos tudo para:\n" +
                        " \n" +
                        "\n" +
                        "Festas juninas  -\tFestas de fim de ano.\n" +
                        "Mês das crianças  - Casamentos.\n" +
                        "Debutante -  Bodas de prata.\n" +
                        "Aniversários - Bodas de Ouro.\n" +
                        "Promoções - Inaugurações.\n" +
                        "Feiras\tFestas de halloween.\n" +
                        "\n" +
                        "A T L A N T I S    B U F F E T \n" +
                        "\n" +
                        "Um lindo Buffet para atender pirituba e região.\n" +
                        "\n" +
                        "Localizado num ponto estratégico próximo de estação de trem e de Terminal de Ônibus.\n" +
                        "\n" +
                        "Uma linda Visão do Todo Magestoso - PICO DO JARAGUÁ.\n" +
                        "\n" +
                        "30 Vagas de estacionamento gratis.\n" +
                        "06 lindos banheiros.\n" +
                        "09 Janelas grandes de vidros lindas e cortinadas.\n" +
                        "TV na parede para passarmos CLIPES a festa toda.\n" +
                        "Brinquedos para as crianças deixarem os convidados curtirem a festa a vontade.\n" +
                        "Cadeiras almofadadas.\n" +
                        "Mesas em mármore.\n" +
                        "Canhões luzentes com movimentos.\n" +
                        "Muito neon.\n" +
                        "Boa alimentação a festa toda.\n" +
                        "<ATLANTIS BUFFET>\n" +
                        "\n" +
                        "O LOCAL CERTO PARA SUA FESTA.\n" +
                        "\n" +
                        "Aqui você encontra: Qualidade, Visual e respeito com o cliente.\n" +
                        "\n" +
                        "Agende já uma visita e sinta a diferença.\n" +
                        "Telefone:  (11) 3441-6800  - (Tim fixo e móvel).\n" +
                        "ou\n" +
                        "(11) 9-9151-6373 (claro). (11) 9-7312-5383 (vivo)\n" +
                        "\n" +
                        "repetindo \n" +
                        "\n" +
                        "Telefone:  (11) 3441-6800  - (Tim fixo e móvel).\n" +
                        "ou\n" +
                        "(11) 9-9151-6373 (claro). (11) 9-7312-5383 (vivo)\n" +
                        "\n" +
                        "ou entre em contato conosco por e-mail\n" +
                        "\n" +
                        "eventos@tudoparafestas.net\n" +
                        "ou\n" +
                        "brasilpromoshow@terra.com.br\n. " +
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
