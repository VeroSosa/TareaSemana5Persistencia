package app.verososa.com.TareaPersistencia;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import app.verososa.com.TareaPersistencia.adapter.MascotaAdaptador;

public class MascotasFavoritas extends AppCompatActivity {
    ImageView imagenDerecha;
    ArrayList mascotas;
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);
        Toolbar miActionBar= (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        ((TextView) findViewById(R.id.toolbar_title)).setText("Petagram");
        imagenDerecha=((ImageView)findViewById(R.id.imagenDerecha));
        imagenDerecha.setVisibility(View.INVISIBLE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perro,0, "Bolo"));
        mascotas.add(new Mascota(R.drawable.perro44, 0, "Zeus"));
        mascotas.add(new Mascota(R.drawable.perro22, 0,"Monny"));
        mascotas.add(new Mascota(R.drawable.perro66, 0,"Kitty"));
        mascotas.add(new Mascota(R.drawable.perro55, 0, "Junior"));


        RecyclerView rvMascotasFav = (RecyclerView)findViewById(R.id.rv_detalle);
        rvMascotasFav.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotasFav.setLayoutManager(llm);
        rvMascotasFav.setClickable(false);
        rvMascotasFav.setEnabled(false);
        rvMascotasFav.setLayoutFrozen(true);
        rvMascotasFav.setItemAnimator(new DefaultItemAnimator());
        MascotaAdaptador adapter = new MascotaAdaptador(mascotas, activity);
        rvMascotasFav.setAdapter(adapter);

    }
}
