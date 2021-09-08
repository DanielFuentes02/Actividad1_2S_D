package com.miactividad.actividad12s_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Intent intent = getIntent();
        String mensaje1 = intent.getStringExtra(MainActivity.enviarNombre);
        String mensaje2 = intent.getStringExtra(MainActivity.enviarApellido);

        TextView nombre = (TextView) findViewById(R.id.textNombre);
        nombre.setText(mensaje1);

        TextView apellido = (TextView) findViewById(R.id.textApellido);
        apellido.setText(mensaje2);
    }
}