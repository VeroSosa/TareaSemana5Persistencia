package app.verososa.com.TareaPersistencia.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import app.verososa.com.TareaPersistencia.Mascota;
import app.verososa.com.TareaPersistencia.R;
import app.verososa.com.TareaPersistencia.adapter.MascotaAdaptador;
import app.verososa.com.TareaPersistencia.presentador.IRecyclerViewFragmentPresenter;
import app.verososa.com.TareaPersistencia.presentador.RecyclerViewFragmentPresenter;


public class RecyclerViewFragment extends Fragment implements  IRecyclerViewFragmentView{

    private List<Mascota> mascotas;
    private RecyclerView rvMascotas;
    private IRecyclerViewFragmentPresenter presenter;

    public RecyclerViewFragment() {
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascota);
        rvMascotas.setHasFixedSize(true);
        presenter = new RecyclerViewFragmentPresenter(this, getContext());
        return v;
    }

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adapter;
        adapter = new MascotaAdaptador(mascotas, getActivity());
        return adapter;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        rvMascotas.setAdapter(adaptador);
    }

}
