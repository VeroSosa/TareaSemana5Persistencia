package app.verososa.com.TareaPersistencia.model;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;

import app.verososa.com.TareaPersistencia.Mascota;
import app.verososa.com.TareaPersistencia.R;
import app.verososa.com.TareaPersistencia.db.BaseDatos;
import app.verososa.com.TareaPersistencia.db.ConstantesBaseDatos;

public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;
    public ConstructorMascotas(Context context){
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){
        BaseDatos db = new BaseDatos(context);
        insertarMascotasaBD(db);
        return db.obtenerTodosLasMascotas();
    }

    public void insertarMascotasaBD(BaseDatos db){

        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Monny");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.perro22);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Keysi");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.perro33);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Bolo");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.perro);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Zeus");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.perro44);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Junior");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.perro55);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Kitty");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.perro66);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Coqueta");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.perro77);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NUMERO_LIKES, 0);
        db.insertarMascota(contentValues);
    }


    public int obtenerLikesMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascota(mascota);
    }

    public void insertarLikesMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        db.insertarLikesMascota(mascota);
    }
}
