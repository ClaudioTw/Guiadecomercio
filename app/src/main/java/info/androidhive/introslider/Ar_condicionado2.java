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

public class Ar_condicionado2  extends AppCompatActivity implements
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
        setContentView(R.layout.ar_condicionado2);

        b1 = (ImageView) findViewById(R.id.btnaudio);



        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);


        TextSliderView aux1 = new TextSliderView(Ar_condicionado2.this);
        aux1.description("Casa Matriz - Ar Condicionado");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Ar_condicionado2.this);
        aux1.setOnImageLoadListener(Ar_condicionado2.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Ar_condicionado2.this);
        aux1.description("Nós queremos o seu conforto.");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Ar_condicionado2.this);
        aux1.setOnImageLoadListener(Ar_condicionado2.this);
        slImages.addSlider(aux1);

        DefaultSliderView aux2 = new DefaultSliderView(Ar_condicionado2.this);
        aux2.image(R.drawable.fotomatrix2);
        aux2.setOnSliderClickListener(Ar_condicionado2.this);
        aux2.description("1");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Ar_condicionado2.this);
        aux2.description(" Ar condicionado - Venda - Instalação - e Contrato preventivo.");
        aux2.image(R.drawable.fotomatrix3);
        aux2.setOnSliderClickListener(Ar_condicionado2.this);
        aux2.description("2");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Ar_condicionado2.this);
        aux2.image(R.drawable.fotomanutencaomatrix);
        aux2.setOnSliderClickListener(Ar_condicionado2.this);
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

                String falar = "samalissa\n" +
                        "ar condicionado.\n" +
                        "\n" +
                        "Manutenção preventiva  e correriva.\n" +
                        "Saiba as vantagens de ser nosso cliente.\n" +
                        "Visita técnica gratuita.\n" +
                        "Lavagem com metasil nas unidades.\n" +
                        "Aplicação de Bio Hair, contro fungos.\n" +
                        "bactérias.\n" +
                        "Agendamento com horas marcada.\n" +
                        "Venda - Instalação - Manutenção.\n" +
                        "\n" +
                        "Parcelamos o pagamento em 3 vezes no cartão.\n" +
                        "\n" +
                        "Você, ainda tem duvidas?\n" +
                        "\n" +
                        "Ligue agora e peça a sua visita técnica.\n" +
                        "\n" +
                        "Telefone: onze - 3999-1119\n" +
                        "ou\n" +
                        " onze - 99310-3676\n" +
                        "ou onze - 99310-3676\n" +
                        "repetindo.\n" +
                        "Telefone: onze - 3999-1119\n" +
                        "ou\n" +
                        " onze - 99310-3676\n" +
                        "ou onze - 99310-3676\n" +
                        "\n" +
                        "Acesse nosso site:\n" +
                        "www.samalissaarcondicionado.com.br\n" +
                        "e nosso email é samalissa@hotmail.com\n" +
                        "\n" +
                        "Venha nos visitar no endereço:\n" +
                        "\n" +
                        "Rua nato Santána, nº422.\n" +
                        "Jd.São Jose - Pirituba - São Paulo.\n" +
                        "\n" +
                        "te aguardamos em samalissa\n" +
                        "ar condicionado.. " +
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


