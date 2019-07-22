package app.verososa.com.TareaPersistencia.fragment;

import java.util.ArrayList;

import app.verososa.com.TareaPersistencia.Mascota;
import app.verososa.com.TareaPersistencia.adapter.MascotaAdaptador;


public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> contactos);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
