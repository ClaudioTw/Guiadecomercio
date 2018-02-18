package info.androidhive.introslider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuGuia extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView rvMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_guia);

        rvMain = (RecyclerView) findViewById(R.id.rvMain);
        Bitmap[] logos = new Bitmap[67];
        logos[0] = BitmapFactory.decodeResource(getResources(), R.drawable.academia);
        logos[1] = BitmapFactory.decodeResource(getResources(), R.drawable.advogados);
        logos[2] = BitmapFactory.decodeResource(getResources(), R.drawable.andaimes);
        logos[3] = BitmapFactory.decodeResource(getResources(), R.drawable.aquecedorsolar);
        logos[4] = BitmapFactory.decodeResource(getResources(), R.drawable.arcondiccarro);
        logos[5] = BitmapFactory.decodeResource(getResources(), R.drawable.arcondicionado);
        logos[6] = BitmapFactory.decodeResource(getResources(), R.drawable.auto);
        logos[7] = BitmapFactory.decodeResource(getResources(), R.drawable.automoveis);
        logos[8] = BitmapFactory.decodeResource(getResources(), R.drawable.azulejo);
        logos[9] = BitmapFactory.decodeResource(getResources(), R.drawable.baterialoja);
        logos[10] = BitmapFactory.decodeResource(getResources(), R.drawable.bololoja);


        logos[11] = BitmapFactory.decodeResource(getResources(), R.drawable.boxbanheiro);
        logos[12] = BitmapFactory.decodeResource(getResources(), R.drawable.buffet);
        logos[13] = BitmapFactory.decodeResource(getResources(), R.drawable.institutobeleza);
        logos[14] = BitmapFactory.decodeResource(getResources(), R.drawable.cacavaza);
        logos[15] = BitmapFactory.decodeResource(getResources(), R.drawable.calhasruf);
        logos[16] = BitmapFactory.decodeResource(getResources(), R.drawable.caminhaomudancas);
        logos[17] = BitmapFactory.decodeResource(getResources(), R.drawable.carrooficina);
        logos[18] = BitmapFactory.decodeResource(getResources(), R.drawable.chaveiro);
        logos[19] = BitmapFactory.decodeResource(getResources(), R.drawable.clinica_veterina);
        logos[20] = BitmapFactory.decodeResource(getResources(), R.drawable.cofres);
        logos[21] = BitmapFactory.decodeResource(getResources(), R.drawable.construcaoreforma);
        logos[22] = BitmapFactory.decodeResource(getResources(), R.drawable.cortinaslojas);
        logos[23] = BitmapFactory.decodeResource(getResources(), R.drawable.decoracao);


        logos[24] = BitmapFactory.decodeResource(getResources(), R.drawable.dedetizacaoeratiza);
        logos[25] = BitmapFactory.decodeResource(getResources(), R.drawable.desentupimento);
        logos[26] = BitmapFactory.decodeResource(getResources(), R.drawable.eletricista);
        logos[27] = BitmapFactory.decodeResource(getResources(), R.drawable.eletronicossomv);
        logos[28] = BitmapFactory.decodeResource(getResources(), R.drawable.encanadores);
        logos[29] = BitmapFactory.decodeResource(getResources(), R.drawable.energsolareletr);

        logos[30] = BitmapFactory.decodeResource(getResources(), R.drawable.esquadriasvidrosalum);
        logos[31] = BitmapFactory.decodeResource(getResources(), R.drawable.extintores);
        logos[32] = BitmapFactory.decodeResource(getResources(), R.drawable.fantasias);
        logos[33] = BitmapFactory.decodeResource(getResources(), R.drawable.festasartalug);
        logos[34] = BitmapFactory.decodeResource(getResources(), R.drawable.fisioterapiadomiciliar);
        logos[35] = BitmapFactory.decodeResource(getResources(), R.drawable.forrosdivisorias);


        logos[36] = BitmapFactory.decodeResource(getResources(), R.drawable.fossasept);
        logos[37] = BitmapFactory.decodeResource(getResources(), R.drawable.fotosfilma);
        logos[38] = BitmapFactory.decodeResource(getResources(), R.drawable.grafica);
        logos[39] = BitmapFactory.decodeResource(getResources(), R.drawable.guinchos);
        logos[40] = BitmapFactory.decodeResource(getResources(), R.drawable.clin);
        logos[41] = BitmapFactory.decodeResource(getResources(), R.drawable.institutobeleza);

        logos[42] = BitmapFactory.decodeResource(getResources(), R.drawable.maqlavarconsert);
        logos[43] = BitmapFactory.decodeResource(getResources(), R.drawable.marcearia);
        logos[44] = BitmapFactory.decodeResource(getResources(), R.drawable.maridoaluguel);
        logos[45] = BitmapFactory.decodeResource(getResources(), R.drawable.marmoregranito);
        logos[46] = BitmapFactory.decodeResource(getResources(), R.drawable.motoboy);
        logos[47] = BitmapFactory.decodeResource(getResources(), R.drawable.moveisescritorios);

        logos[48] = BitmapFactory.decodeResource(getResources(), R.drawable.odonto);
        logos[49] = BitmapFactory.decodeResource(getResources(), R.drawable.odonto);
        logos[50] = BitmapFactory.decodeResource(getResources(), R.drawable.pisos);
        logos[51] = BitmapFactory.decodeResource(getResources(), R.drawable.pisolaminados);
        logos[52] = BitmapFactory.decodeResource(getResources(), R.drawable.pizzaria);
        logos[53] = BitmapFactory.decodeResource(getResources(), R.drawable.planossaude);

        logos[54] = BitmapFactory.decodeResource(getResources(), R.drawable.portasautomaticas);
        logos[55] = BitmapFactory.decodeResource(getResources(), R.drawable.redesprot);
        logos[56] = BitmapFactory.decodeResource(getResources(), R.drawable.reformasconstruc);
        logos[57] = BitmapFactory.decodeResource(getResources(), R.drawable.refrigeracaoconserto);
        logos[58] = BitmapFactory.decodeResource(getResources(), R.drawable.restaurante);
        logos[59] = BitmapFactory.decodeResource(getResources(), R.drawable.restfrutmar);

        logos[60] = BitmapFactory.decodeResource(getResources(), R.drawable.portasautomaticas);
        logos[61] = BitmapFactory.decodeResource(getResources(), R.drawable.redesprot);
        logos[62] = BitmapFactory.decodeResource(getResources(), R.drawable.reformasconstruc);
        logos[63] = BitmapFactory.decodeResource(getResources(), R.drawable.refrigeracaoconserto);
        logos[64] = BitmapFactory.decodeResource(getResources(), R.drawable.restaurante);
        logos[65] = BitmapFactory.decodeResource(getResources(), R.drawable.restfrutmar);
        logos[66] = BitmapFactory.decodeResource(getResources(), R.drawable.restfrutmar);


        MenuGuia.MyAdapter adapter = new MenuGuia.MyAdapter(getResources().getStringArray(R.array.company_list), logos);
        rvMain.setLayoutManager(new GridLayoutManager(MenuGuia.this, 2));
        rvMain.setAdapter(adapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    private class MyAdapter extends RecyclerView.Adapter<MenuGuia.MyViewHolder> {

        String[] companyList;
        Bitmap[] logoList;

        public MyAdapter(String[] companyList, Bitmap[] logoList) {
            this.companyList = companyList;
            this.logoList = logoList;
        }
        @Override
        public MenuGuia.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
            MenuGuia.MyViewHolder viewHolder = new MenuGuia.MyViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(MenuGuia.MyViewHolder holder, final int position) {
            holder.logo.setImageBitmap(logoList[position]);
            holder.logo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MenuGuia.this, "This is: " + companyList[position], Toast.LENGTH_SHORT).show();

                    switch (position){
                        case 0:
                            Intent intent0 = new Intent(MenuGuia.this, Academias.class);
                            startActivity(intent0);
                            break;

                        case 1:
                            Intent intent1 = new Intent(MenuGuia.this, Card_advogado.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(MenuGuia.this, Andaimes.class);
                            startActivity(intent2);
                            break;

                        case 3:
                            Intent intent3 = new Intent(MenuGuia.this,Aquecedorsolar.class);
                            startActivity(intent3);
                            break;

                        case 4:
                            Intent intent4 = new Intent(MenuGuia.this, Ar_carro.class);
                            startActivity(intent4);
                            break;

                        case 5:
                            Intent intent5 = new Intent(MenuGuia.this, Ar_condicionado.class);
                            startActivity(intent5);
                            break;

                        case 6:
                            Intent intent6 = new Intent(MenuGuia.this, Autos.class);
                            startActivity(intent6);
                            break;

                        case 7:
                            Intent intent7 = new Intent(MenuGuia.this, Automoveis.class);
                            startActivity(intent7);
                            break;

                        case 8:
                            Intent intent8 = new Intent(MenuGuia.this, Azulejo.class);
                            startActivity(intent8);
                            break;



                        case 9:
                            Intent intent9 = new Intent(MenuGuia.this, Bateria.class);
                            startActivity(intent9);
                            break;

                        case 10:
                            Intent intent10 = new Intent(MenuGuia.this, Bolos.class);
                            startActivity(intent10);
                            break;





                        case 11:
                            Intent intent11 = new Intent(MenuGuia.this, Banheiro.class);
                            startActivity(intent11);
                            break;

                        case 12:
                            Intent intent12 = new Intent(MenuGuia.this, Buffet.class);
                            startActivity(intent12);
                            break;

                        case 13:
                            Intent intent13 = new Intent(MenuGuia.this, Beleza.class);
                            startActivity(intent13);
                            break;

                        case 14:
                            Intent intent14 = new Intent(MenuGuia.this, Cacavaza.class);
                            startActivity(intent14);
                            break;

                        case 15:
                            Intent intent15 = new Intent(MenuGuia.this, Calhasruf.class);
                            startActivity(intent15);
                            break;

                        case 16:
                            Intent intent16 = new Intent(MenuGuia.this, Caminhaomudanca.class);
                            startActivity(intent16);
                            break;

                        case 17:
                            Intent intent17 = new Intent(MenuGuia.this, CarroOficina.class);
                            startActivity(intent17);
                            break;

                        case 18:
                            Intent intent18 = new Intent(MenuGuia.this, Chaveiro.class);
                            startActivity(intent18);
                            break;

                        case 19:
                            Intent intent19 = new Intent(MenuGuia.this, ClinVeterinaria.class);
                            startActivity(intent19);
                            break;

                        case 20:
                            Intent intent20 = new Intent(MenuGuia.this, Cofres.class);
                            startActivity(intent20);
                            break;

                        case 21:
                            Intent intent21 = new Intent(MenuGuia.this, Construcaoreforma.class);
                            startActivity(intent21);
                            break;


                        case 22:
                            Intent intent22 = new Intent(MenuGuia.this, Cortinas.class);
                            startActivity(intent22);
                            break;

                        case 23:
                            Intent intent23 = new Intent(MenuGuia.this, Decoracao.class);
                            startActivity(intent23);
                            break;

                        case 24:
                            Intent intent24 = new Intent(MenuGuia.this, Dedetizacao.class);
                            startActivity(intent24);
                            break;

                        case 25:
                            Intent intent25 = new Intent(MenuGuia.this, Desentupimento.class);
                            startActivity(intent25);
                            break;

                        case 26:
                            Intent intent26 = new Intent(MenuGuia.this, Eletricista.class);
                            startActivity(intent26);
                            break;

                        case 27:
                            Intent intent27 = new Intent(MenuGuia.this, EletroTv.class);
                            startActivity(intent27);
                            break;

                        case 28:
                            Intent intent28 = new Intent(MenuGuia.this, Encanadores.class);
                            startActivity(intent28);
                            break;

                        case 29:
                            Intent intent29 = new Intent(MenuGuia.this, EnergiaSolar.class);
                            startActivity(intent29);
                            break;

                        case 30:
                            Intent intent30 = new Intent(MenuGuia.this, EsquadriasAluminio.class);
                            startActivity(intent30);
                            break;

                        case 31:
                            Intent intent31 = new Intent(MenuGuia.this, Extintores.class);
                            startActivity(intent31);
                            break;

                        case 32:
                            Intent intent32 = new Intent(MenuGuia.this, Fantasias.class);
                            startActivity(intent32);
                            break;

                        case 33:
                            Intent intent33 = new Intent(MenuGuia.this, Festa_Artfesta.class);
                            startActivity(intent33);
                            break;

                        case 34:
                            Intent intent34 = new Intent(MenuGuia.this, Fsioterapia.class);
                            startActivity(intent34);
                            break;

                        case 35:
                            Intent intent35 = new Intent(MenuGuia.this, ForrosDivisorias.class);
                            startActivity(intent35);
                            break;

                        case 36 :
                            Intent intent36 = new Intent(MenuGuia.this, Fossassepticas.class);
                            startActivity(intent36);
                            break;


                        case 37:
                            Intent intent37 = new Intent(MenuGuia.this, FotoFilmagem.class);
                            startActivity(intent37);
                            break;

                        case 38:
                            Intent intent38 = new Intent(MenuGuia.this, Graficas.class);
                            startActivity(intent38);
                            break;

                        case 39:
                            Intent intent39 = new Intent(MenuGuia.this, Guinchos.class);
                            startActivity(intent39);
                            break;

                        case 40:
                            Intent intent40 = new Intent(MenuGuia.this, Hospveterinario.class);
                            startActivity(intent40);
                            break;

                        case 41:
                            Intent intent41 = new Intent(MenuGuia.this, Institutobeleza.class);
                            startActivity(intent41);
                            break;

                        case 42:
                            Intent intent42 = new Intent(MenuGuia.this, MaquinaLavar.class);
                            startActivity(intent42);
                            break;

                        case 43:
                            Intent intent43 = new Intent(MenuGuia.this, Marcenaria.class);
                            startActivity(intent43);
                            break;

                        case 44:
                            Intent intent44 = new Intent(MenuGuia.this, MaridoAluguel.class);
                            startActivity(intent44);
                            break;

                        case 45:
                            Intent intent45 = new Intent(MenuGuia.this, MarmoreGranito.class);
                            startActivity(intent45);
                            break;

                        case 46:
                            Intent intent46 = new Intent(MenuGuia.this, Motoboy.class);
                            startActivity(intent46);
                            break;

                        case 47:
                            Intent intent47= new Intent(MenuGuia.this, MoveisEscritorio.class);
                            startActivity(intent47);
                            break;

                        case 48:
                            Intent intent48 = new Intent(MenuGuia.this, Odonto.class);
                            startActivity(intent48);
                            break;

                        case 49:
                            Intent intent49 = new Intent(MenuGuia.this, Persianas.class);
                            startActivity(intent49);
                            break;

                        case 50:
                            Intent intent50 = new Intent(MenuGuia.this, Pisos.class);
                            startActivity(intent50);
                            break;

                        case 51:
                            Intent intent51 = new Intent(MenuGuia.this, PisosLaminados.class);
                            startActivity(intent51);
                            break;

                        case 52:
                            Intent intent52 = new Intent(MenuGuia.this, Pizzzarias.class);
                            startActivity(intent52);
                            break;

                        case 53:
                            Intent intent53 = new Intent(MenuGuia.this, PlanoSaude.class);
                            startActivity(intent53);
                            break;

                        case 54:
                            Intent intent54 = new Intent(MenuGuia.this, PortasAutomaticas.class);
                            startActivity(intent54);
                            break;

                        case 55:
                            Intent intent55 = new Intent(MenuGuia.this, RedesProtecao.class);
                            startActivity(intent55);
                            break;


                        case 56:
                            Intent intent56 = new Intent(MenuGuia.this, PortasAutomaticas.class);
                            startActivity(intent56);
                            break;


                    }



                }
            });
            holder.name.setText(companyList[position]);
        }

        @Override
        public int getItemCount() {
            return companyList.length;
        }
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView logo;
        public TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);
            logo = (ImageView) itemView.findViewById(R.id.ivLogo);
            name = (TextView) itemView.findViewById(R.id.tvCompany);


        }
    }





    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_guia, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

        } else if (id == R.id.action_settings2) {
            Intent intent = new Intent(MenuGuia.this, Cadastroweb.class);
            startActivity(intent);

        } else if (id == R.id.action_settings3) {
            findViewById(R.id.action_settings3).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // We normally won't show the welcome slider again in real app
                    // but this is for testing
                    PrefManager prefManager = new PrefManager(getApplicationContext());

                    // make first time launch TRUE
                    prefManager.setFirstTimeLaunch(true);

                    startActivity(new Intent(MenuGuia.this, WelcomeActivity.class));
                    finish();
                }
            });

        } else if (id == R.id.action_settings4) {
            Intent intent = new Intent(MenuGuia.this, Mapa.class);
            startActivity(intent);


            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent intent = new Intent(MenuGuia.this, Advogados2.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(MenuGuia.this, Advogados2.class);
            startActivity(intent);


        } else if (id == R.id.nav_slideshow) {
            Intent intent = new Intent(MenuGuia.this, Mapa.class);
            startActivity(intent);



        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
