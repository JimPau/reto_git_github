package com.jimena.reto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText edtNombre;
    private Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre = findViewById(R.id.edtnombre);

        btnEnviar = findViewById(R.id.btnenviar);

    }

    public void btn_bienvenida (View view) {
        Toast.makeText(MainActivity.this, "Bienvenido a este mundo ☺", Toast.LENGTH_SHORT).show();

    }

    public void validar (View view){
        String mNombre = edtNombre.getText().toString();




        if (mNombre.isEmpty()){
            Toast.makeText(this, "Ingrese el nombre ", Toast.LENGTH_LONG).show();
            // Alerta de error
            edtNombre.setError("Ingrese el nombre");
            // Señala donde completar el campo vacio
            edtNombre.requestFocus();

        } else if (mNombre.equals("Jimena")) {
            Toast.makeText(this, "Encontre a mi gemela ", Toast.LENGTH_LONG).show();

            Intent i = new Intent(MainActivity.this, DatosActivity.class);
            i.putExtra("Nombre",edtNombre.getText().toString());
            startActivity(i);


        } else {
            Toast.makeText(this, "Bienvenido(a) " + mNombre, Toast.LENGTH_LONG).show();

            Intent i = new Intent(MainActivity.this, DatosActivity.class);
            i.putExtra("Nombre",edtNombre.getText().toString());
            startActivity(i);


        }

        Log.d("", "nombre: " + mNombre);
    }




}