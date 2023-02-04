package com.jimena.reto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {


    private TextView tvnombre;

    // Metodo para el boton regresar aqui el VIew si funciona
    public void regresar (View view) {
        Intent i = new Intent(DatosActivity.this, MainActivity.class);
        startActivity(i);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        tvnombre = (TextView)findViewById(R.id.tvnombre);


        String respuesta = getIntent().getStringExtra("Nombre"  );
        tvnombre.setText( "Me llamo " + respuesta   );




    }
}