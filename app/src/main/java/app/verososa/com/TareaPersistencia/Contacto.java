package app.verososa.com.TareaPersistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Contacto extends AppCompatActivity {

    private Button buttonEnviar;
    ImageView imagenDerecha;
    TextInputEditText nombre;
    TextInputEditText emaill;
    TextInputEditText comentario;
    TextInputEditText passwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        Toolbar miActionBar= (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView) findViewById(R.id.toolbar_title)).setText("Contacto");
        imagenDerecha=((ImageView)findViewById(R.id.imagenDerecha));
        imagenDerecha.setVisibility(View.INVISIBLE);

        buttonEnviar= (Button) findViewById(R.id.btnEnviarComentario);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nombre = (TextInputEditText) findViewById(R.id.etNombreContacto);
                emaill = (TextInputEditText) findViewById(R.id.etEmailContacto);
                comentario = (TextInputEditText) findViewById(R.id.etComentario);
                passwd = (TextInputEditText) findViewById(R.id.etPasswdContacto);

                EmailSender emailSender = new EmailSender();
                emailSender.execute(emaill.getText().toString(),passwd.getText().toString(),"olga-veronica@hotmail.com",
                        "desdeAndroid",comentario.getText().toString(),"");


                Intent i = new Intent(Contacto.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

}
