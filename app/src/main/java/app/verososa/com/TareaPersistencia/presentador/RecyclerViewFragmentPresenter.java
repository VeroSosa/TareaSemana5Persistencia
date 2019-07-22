package app.verososa.com.TareaPersistencia.presentador;

import android.content.Context;

import java.util.ArrayList;

import app.verososa.com.TareaPersistencia.Mascota;
import app.verososa.com.TareaPersistencia.fragment.IRecyclerViewFragmentView;
import app.verososa.com.TareaPersistencia.model.ConstructorMascotas;

/**
 * Created by User on 29/5/2016.
 */
public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter{
    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
    }

    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas= constructorMascotas.obtenerDatos();
        mostrarMascotasRV();
    }

    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
