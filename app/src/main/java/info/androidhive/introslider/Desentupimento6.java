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

public class Desentupimento6  extends AppCompatActivity implements
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
        setContentView(R.layout.desentupimento6);

        b1 = (ImageView) findViewById(R.id.btnaudio);



        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Desentupimento6.this);
        aux1.description("Casa Matriz - Ar Condicionado");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Desentupimento6.this);
        aux1.setOnImageLoadListener(Desentupimento6.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Desentupimento6.this);
        aux1.description("Nós queremos o seu conforto.");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Desentupimento6.this);
        aux1.setOnImageLoadListener(Desentupimento6.this);
        slImages.addSlider(aux1);

        DefaultSliderView aux2 = new DefaultSliderView(Desentupimento6.this);
        aux2.image(R.drawable.fotomatrix2);
        aux2.setOnSliderClickListener(Desentupimento6.this);
        aux2.description("1");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Desentupimento6.this);
        aux2.description("Os Maiores Peixes com Caiaque");
        aux2.image(R.drawable.fotomatrix3);
        aux2.setOnSliderClickListener(Desentupimento6.this);
        aux2.description("2");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Desentupimento6.this);
        aux2.image(R.drawable.fotomanutencaomatrix);
        aux2.setOnSliderClickListener(Desentupimento6.this);
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

                String falar = "Aquarella Desentupidora \n" +
                        "DESENTUPIDORA SP\n" +
                        "\n" +
                        "Por um bairro mais limpo e com menos problemas de enchentes.\n" +
                        "A Aquarella Desentupidora oferece serviços de desentupimento em geral.\n" +
                        "\n" +
                        "Realizamos serviços 24 horas com equipe técnica altamente capacitada. \n" +
                        "Com uma estrutura robusta e ágil, temos capacidade de realizar o pronto atendimento às \n" +
                        "solicitações de emergência para execução de diversos tipos de desentupimento.\n" +
                        "\n" +
                        "Nos casos de desentupimento de canos é utilizado o sistema de Roto System:\n" +
                        "\n" +
                        "Máquina k500 com cabos flexíveis e ponteiras apropriadas para cada tipo de tubulação, \n" +
                        "indicado para limpeza e raspagem de tubulação com diâmetros que variam de ¾ á 8” (PVC, ferro, etc).\n" +
                        "\n" +
                        "COMO É FEITA A MANUTENÇÃO DE TUBULAÇÕES?\n" +
                        "DESENTUPIDORA - POR QUE VOCÊ PRECISA DE UMA\n" +
                        "PRINCIPAIS SERVIÇOS DE UMA DESENTUPIDORA\n" +
                        "QUAIS OS CUIDADOS TOMAR AO ESCOLHER UMA EMPRESA DE DESENTUPIMENTO?\n" +
                        "SERVIÇOS DE DESENTUPIDORA GARANTE TRANQUILIDADE A QUEM CONTRATA\n" +
                        "O objetivo da Desentupidora Aquarella é garantir um serviço bem feito \n" +
                        "com a finalidade de estabelecer um compromisso duradouro com seus clientes.\n" +
                        "\n" +
                        "Desentupimento de Canos\n" +
                        "Desentupimento de Colunas\n" +
                        "Desentupimento de Esgoto\n" +
                        "Desentupimento de Pia\n" +
                        "Desentupimento de Ralo\n" +
                        "Desentupimento de Vaso Sanitário\n" +
                        "Hidrojateamento\n" +
                        "Limpeza de Caixa d'Água\n" +
                        "Limpeza de Fossa\n" +
                        "Limpeza de Caixa de Gordura\n" +
                        "Agende uma visita gratuita e Resolva seu Problema em 4 passos\n" +
                        "1-) Entupiu? Ligue (11) 3333-6000 e Agende uma Visita Gratuita. \n" +
                        "\n" +
                        "2-) No local, nossos técnicos avaliarão o problema e lhe passarão um orçamento.\n" +
                        "\n" +
                        "3-) Se você aprovar, o serviço de desentupimento é executado na hora. Pronto!  \n" +
                        "\n" +
                        "4-) Oferecemos garantia de 3 meses para serviços de desentupimento. \n" +
                        "\n" +
                        "Confira nossa frota\n" +
                        "equipe-aquarella-desentupidoraequipe-técnica-aquarellaaquarella-desentupidora-5caminhoes-aquarellaaquarella-desentupidora-11aquarella-desentupidora-equipeaquarella-desentupidora-13aquarella-desentupidora-28caminhoes-aquarella-desentupidora\n" +
                        "Comentários\n" +
                        "\n" +
                        "LIGUE: (11) 3333-6000\n" +
                        "CONTATO IMEDIATO\n" +
                        "\n" +
                        "Venha nos visitar em \n" +
                        " R. Javaés,  nº613 • - São Paulo  - SP . " +
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


