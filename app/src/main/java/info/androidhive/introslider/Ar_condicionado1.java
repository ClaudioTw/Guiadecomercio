


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

public class Ar_condicionado1  extends AppCompatActivity implements
        BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

    TextToSpeech t1;
    ImageView b1;

    private String[] images = {

            "http://casamatrix.com.br/images/rotor/foto-1a.jpg",
            "http://casamatrix.com.br/images/aparelhos_ar_condicionado.png",
            "http://casamatrix.com.br/images/ar-condicionado.jpg"};

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
        setContentView(R.layout.ar_condicionado1);

        b1 = (ImageView) findViewById(R.id.btnaudio);



        // SLIDERLAYOUT
        slImages = (SliderLayout) findViewById(R.id.slImages);

        TextSliderView aux1 = new TextSliderView(Ar_condicionado1.this);
        aux1.description("Casa Matriz - Ar Condicionado");
        aux1.image(images[0]);
        aux1.setOnSliderClickListener(Ar_condicionado1.this);
        aux1.setOnImageLoadListener(Ar_condicionado1.this);
        slImages.addSlider(aux1);

        aux1 = new TextSliderView(Ar_condicionado1.this);
        aux1.description("Nós queremos o seu conforto.");
        aux1.image(images[1]);
        aux1.setOnSliderClickListener(Ar_condicionado1.this);
        aux1.setOnImageLoadListener(Ar_condicionado1.this);
        slImages.addSlider(aux1);

        DefaultSliderView aux2 = new DefaultSliderView(Ar_condicionado1.this);
        aux2.image(R.drawable.fotomatrix2);
        aux2.setOnSliderClickListener(Ar_condicionado1.this);
        aux2.description("1");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Ar_condicionado1.this);
        aux2.description(" Ar condicionado - Venda - Instalação - e Contrato preventivo.");
        aux2.image(R.drawable.fotomatrix3);
        aux2.setOnSliderClickListener(Ar_condicionado1.this);
        aux2.description("2");
        slImages.addSlider(aux2);

        aux2 = new DefaultSliderView(Ar_condicionado1.this);
        aux2.image(R.drawable.fotomanutencaomatrix);
        aux2.setOnSliderClickListener(Ar_condicionado1.this);
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

                String falar = "Casa Matrix\n" +
                        "AR CONDICIONADO, VENDA, INSTALAÇÃO E CONTRATO PREVENTIVO.\n" +
                        " Casa Matrix - Ar Condicionado\n" +
                        "Trabalhamos com aparelhos tipo ‘Mult-Split,PISO TETO, K7, FANCOIL,PORTATIL E ACJ.\n" +
                        "EMITIMOS LAUDO (PMOC) Venda, Instalação, Projetos e Manutenção.\n" +
                        "Casa Matrix - SERVIÇOS\n" +
                        "Instalação, Manutenção e Projetos.\n" +
                        "Contando com equipe própria para instalações de equipamentos de ar condicionado em geral com corpo de engenharia próprio registrado no CREA com profissionais a mais de 20 anos no mercado atuando nos seguimentos abaixo:\n" +
                        "Instalação de equipamentos de ar condicionado conforme normas ABNT / NBR.\n" +
                        "Manutenção preventiva (limpeza & higienização).\n" +
                        "Manutenção Corretiva.\n" +
                        "Contratos de manutenção com implantação de PMOC (Plano de Manutenção Operação e Controle.\n" +
                        "Projetos de ar condicionado, ventilação e exaustão.\n" +
                        "Rede de dutos, grelhas e difusores.\n" +
                        "\n" +
                        "Entre em contato conosco nos telefones:.\n" +
                        "onze - 3975  6681\n" +
                        "ou\n" +
                        " onze - 94767-9117\n" +
                        "\n" +
                        "repetindo.\n" +
                        "\n" +
                        "onze - 3975  6681\n" +
                        "ou\n" +
                        " onze - 94767-9117\n" +
                        "\n" +
                        "nosso E-mail: -  casamatrix@casamatrix.com.br.\n" +
                        "\n" +
                        "Acesse nosso site - www.casamatrix.com\n" +
                        "\n" +
                        "Venha nos fazer uma visita no\n" +
                        "\n" +
                        "\n" +
                        "Endereço: Travessa Raphael Ramponi, 02\n" +
                        "Cep.: 02933-020 São Paulo - SP\n. " +
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


