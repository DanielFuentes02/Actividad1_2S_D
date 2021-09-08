package com.miactividad.actividad12s_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String enviarNombre ="nombre";
    public static final String enviarApellido = "apellido";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviarDatos(View view){
        Intent intent = new Intent( this, SegundoActivity.class);
        EditText nombre = (EditText) findViewById(R.id.editNombre);
        EditText apellido = (EditText) findViewById(R.id.editApellido);
        String mensaje1 = nombre.getText().toString();
        String mensaje2 = apellido.getText().toString();
        intent.putExtra(enviarNombre, mensaje1);
        intent.putExtra(enviarApellido, mensaje2);
        startActivity(intent);
    }
}