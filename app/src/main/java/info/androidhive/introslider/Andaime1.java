
    package info.androidhive.introslider;

        import android.Manifest;
        import android.content.Intent;
        import android.content.pm.PackageManager;
        import android.net.Uri;
        import android.os.Bundle;
import android.speech.tts.TextToSpeech;
        import android.support.v4.app.ActivityCompat;
        import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.Locale;


    public class Andaime1  extends AppCompatActivity implements
            BaseSliderView.OnSliderClickListener, BaseSliderView.ImageLoadListener {

        TextToSpeech t1;
        ImageView b1;
        Button btnCall2;
        Button btnCall;
        EditText nunTxt;
        ImageView btnFace;
        ImageView bntGoogle;
        ImageView bntInstagram;
        ImageView btnWhats;
        ImageView btnEmail;

        private String[] images = {

                "https://i.ytimg.com/vi/Fxac9DR1X2E/maxresdefault.jpg",
                "https://lh3.googleusercontent.com/proxy/u9UokSDJwHPiMp_HSG_vEU7lVukq0EPKhET19fH4-m_Cx3DixF4zG9AW4YPI22IXwmSrK2yfScD3xLON0bJqN-BbQA=w530-h298-n",
                "https://i.ytimg.com/vi/PoknRc6WBXo/hqdefault.jpg"};


        private SliderLayout slImages;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.andaime1);

            b1 = (ImageView) findViewById(R.id.btnaudio);
            nunTxt = (EditText) findViewById(R.id.idNumtxt);
            btnCall = (Button) findViewById(R.id.idbtnCall);
            btnCall2 = (Button) findViewById(R.id.idbtnCall2);
            btnFace = (ImageView) findViewById(R.id.imageView5);
            bntGoogle = (ImageView) findViewById(R.id.imageView6);
            bntInstagram = (ImageView) findViewById(R.id.imageView);
            btnWhats = (ImageView) findViewById(R.id.imageView7);
            btnWhats = (ImageView) findViewById(R.id.imageView7);
            btnEmail = (ImageView) findViewById(R.id.ideMaill);

            btnCall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String numero = nunTxt.getText().toString();
                    Uri uri = Uri.parse("tel:" + 39981452);


                    Intent intent;
                    intent = new Intent(Intent.ACTION_CALL, uri);
                    if (ActivityCompat.checkSelfPermission(Andaime1.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Andaime1.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }

            });

            btnCall2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String numero = nunTxt.getText().toString();
                    Uri uri = Uri.parse("tel:" + 39929601);


                    Intent intent;
                    intent = new Intent(Intent.ACTION_CALL, uri);
                    if (ActivityCompat.checkSelfPermission(Andaime1.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Andaime1.this, new String[]{Manifest.permission.CALL_PHONE}, 1);


                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }

            });
            btnFace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.facebook.com"));
                    startActivity(intent);
                }
            });

            bntGoogle .setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.plus.google.com/u/o/"));
                    startActivity(intent);
                }
            });

            bntInstagram.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.instagram.com"));
                    startActivity(intent);

                }
            });

            btnWhats.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(Andaime1.this,"VALEZI & GARCIA não disponibilizou whatsapp", Toast.LENGTH_SHORT).show();

                }
            });

            btnEmail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setData(Uri.parse("email"));
                    String[] s ={"teste@gmail.com"};
                    i.putExtra(Intent.EXTRA_EMAIL,s);
                    i.putExtra(Intent.EXTRA_SUBJECT, "Este é um teste");
                    i.putExtra(Intent.EXTRA_TEXT,"Ola eu sou o corpo de seu email");
                    i.setType("message /rf822");
                    Intent chooser = Intent.createChooser(i,"Enviar Email");
                    startActivity(chooser);
                }

            });


            // SLIDERLAYOUT
            slImages = (SliderLayout) findViewById(R.id.slImages);

            TextSliderView aux1 = new TextSliderView(Andaime1.this);
            aux1.description("Pescarias Emocionantes");
            aux1.image(images[0]);
            aux1.setOnSliderClickListener(Andaime1.this);
            aux1.setOnImageLoadListener(Andaime1.this);
            slImages.addSlider(aux1);

            aux1 = new TextSliderView(Andaime1.this);
            aux1.description("Aprenda a Pescar Conosco");
            aux1.image(images[1]);
            aux1.setOnSliderClickListener(Andaime1.this);
            aux1.setOnImageLoadListener(Andaime1.this);
            slImages.addSlider(aux1);

            TextSliderView aux2 = new TextSliderView(Andaime1.this);
            aux2.setOnSliderClickListener(Andaime1.this);
            aux2.description("Isso é um teste");
            aux2.image(R.drawable.andaimes);
            slImages.addSlider(aux2);

            aux2 = new TextSliderView(Andaime1.this);
            aux2.image(R.drawable.advo1);
            aux2.setOnSliderClickListener(Andaime1.this);
            aux2.description("Isso é um teste 2");
            slImages.addSlider(aux2);

            aux2 = new TextSliderView(Andaime1.this);
            aux2.description("Os Maiores Peixes com Caiaque");
            aux2.image(R.drawable.advocacia1);
            aux2.setOnSliderClickListener(Andaime1.this);
            slImages.addSlider(aux2);

            aux2 = new TextSliderView(Andaime1.this);
            aux2.description("Os Maiores Peixes com Caiaque 2");
            aux2.image(R.drawable.advogados);
            aux2.setOnSliderClickListener(Andaime1.this);
            slImages.addSlider(aux2);


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

                    String falar = "Al Batista \n" +
                            "Trabalhamos com venda - aluguel de andaimes e escadas.\n" +
                            "\n" +
                            "Disponibilizamos Colunas - Vigas - Baldrames - cimento - cal e Sapatas sob medidas.\n" +
                            "\n" +
                            "Temos preços de fabricão.\n" +
                            "\n" +
                            "Aceitamo todos os cartões de creditos.\n" +
                            "\n" +
                            "Ligue agora para onze- 3904-1277 ou onze-2843-9257\n" +
                            "\n" +
                            "Estamos aguardando a sua visita na " +
                            "Estrada Turística do jaragua - nº65 A \n" +
                            "Cep:05161-000\n" +
                            "Jd. Monte Alegre- Pirituba " +
                            " " +
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


