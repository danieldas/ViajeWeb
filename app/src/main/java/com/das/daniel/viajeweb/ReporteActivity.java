package com.das.daniel.viajeweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReporteActivity extends AppCompatActivity {

    TextView _tvDestino, _tvHorario, _tvPrecio, _tvNombre, _tvApellido, _tvCi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte);

        Intent i=getIntent();
        final String destino=i.getExtras().getString("DESTINO");
        final String horario=i.getExtras().getString("HORARIO");
        final String precio=i.getExtras().getString("PRECIO");
        final String ci=i.getExtras().getString("CI");
        final String nombre=i.getExtras().getString("NOMBRE");
        final String apellido=i.getExtras().getString("APELLIDO");

        _tvDestino= (TextView) findViewById(R.id.tvReDestino);
        _tvHorario= (TextView) findViewById(R.id.tvReHorario);
        _tvPrecio= (TextView) findViewById(R.id.tvRePrecio);
        _tvCi= (TextView) findViewById(R.id.tvReCi);
        _tvNombre= (TextView) findViewById(R.id.tvReNombre);
        _tvApellido= (TextView) findViewById(R.id.tvReApellido);

        _tvDestino.setText(destino);
        _tvHorario.setText(horario);
        _tvPrecio.setText(precio);
        _tvCi.setText(ci);
        _tvNombre.setText(nombre);
        _tvApellido.setText(apellido);
    }
}
