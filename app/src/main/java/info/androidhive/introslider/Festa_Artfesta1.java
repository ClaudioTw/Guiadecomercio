

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

public class Festa_Artfesta1  extends AppCompatActivity implements
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
        setContentView(R.layout.festa__artfesta1);

        b1 = (ImageView) findViewById(R.id.btnaudio);



        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Festa_Artfesta1.this);
        aux1.description("Pescarias Emocionantes");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Festa_Artfesta1.this);
        aux1.setOnImageLoadListener(Festa_Artfesta1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Festa_Artfesta1.this);
        aux1.description("Aprenda a Pescar Conosco");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Festa_Artfesta1.this);
        aux1.setOnImageLoadListener(Festa_Artfesta1.this);
        slImages.addSlider(aux1);

        DefaultSliderView aux2 = new DefaultSliderView(Festa_Artfesta1.this);
        aux2.image(R.drawable.image_1);
        aux2.setOnSliderClickListener(Festa_Artfesta1.this);
        aux2.description("1");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Festa_Artfesta1.this);
        aux2.description("Os Maiores Peixes com Caiaque");
        aux2.image(R.drawable.image_2);
        aux2.setOnSliderClickListener(Festa_Artfesta1.this);
        aux2.description("2");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Festa_Artfesta1.this);
        aux2.image(R.drawable.image_3);
        aux2.setOnSliderClickListener(Festa_Artfesta1.this);
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

                String falar = "Horário de atendimento\n" +
                        "Das 10:00hs as 19:00hs (de segunda a sexta-feira) Das 09:00hs as 18:00hs (aos sábados) NÃO ABRIMOS AOS DOMINGOS\n" +
                        "10:00hs as 19:00hs (de segunda a sexta) e 09:00hs as 18:00hs (sábado). NÃO ABRIMOS AOS DOMINGOS\n" +
                        "\n" +
                        "Endereços\n" +
                        "LOJA 1 - Rua Parapuã, 86 - (Itaberaba) - Tel.: (11) 3992-8723\n" +
                        "\n" +
                        "LOJA 2 - Rua Chico de Paula, 67- (Freguesia do Ó) - Tel.: (11) 3932-0362\n" +
                        "\n" +
                        "LOJA 3 - Av. Guilherme Cotching, 1136" +
                        " (Vila Maria) - Tel.: (11) 2365-0844\n" +
                        "\n" +
                        "WhatsApp: (11) 96228-2467\n" +
                        "\n" +
                        "Fantasias Do Ó\n" +
                        "\n" +
                        "Rua Parapuã, 86 LOJA\n" +
                        "Itaberaba São Paulo, SP \n" +
                        "02831-000\n" +
                        "http://www.fantasiasdoo.com.br. " +
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


