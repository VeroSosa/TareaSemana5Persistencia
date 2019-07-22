package app.verososa.com.TareaPersistencia.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

import app.verososa.com.TareaPersistencia.Mascota;
import app.verososa.com.TareaPersistencia.R;
import app.verososa.com.TareaPersistencia.adapter.MascotaAdaptador;


public class PerfilFragment extends Fragment {

    ArrayList mascotas;
    RecyclerView rvPerfil;
    public PerfilFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_perfil, container, false);


        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perro1,0, ""));
        mascotas.add(new Mascota(R.drawable.perro2, 0, ""));
        mascotas.add(new Mascota(R.drawable.perro3, 0,""));
        mascotas.add(new Mascota(R.drawable.perro4, 0,""));
        mascotas.add(new Mascota(R.drawable.perro5, 0, ""));
        mascotas.add(new Mascota(R.drawable.perro6, 0, ""));
        mascotas.add(new Mascota(R.drawable.perro7, 0, ""));
        mascotas.add(new Mascota(R.drawable.perro8, 0, ""));
        mascotas.add(new Mascota(R.drawable.perro9, 0, ""));

        rvPerfil = (RecyclerView) v.findViewById(R.id.rv_perfil);
        rvPerfil.setHasFixedSize(true);
        final GridLayoutManager glm= new GridLayoutManager(getActivity(),3,GridLayoutManager.VERTICAL,false);
        rvPerfil.setLayoutManager(glm);
        MascotaAdaptador adapter = new MascotaAdaptador(mascotas, getActivity());
        rvPerfil.setAdapter(adapter);

        return v;
    }

}
