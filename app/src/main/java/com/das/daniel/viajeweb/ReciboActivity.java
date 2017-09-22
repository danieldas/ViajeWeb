package com.das.daniel.viajeweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReciboActivity extends AppCompatActivity {

    TextView _tvDestino, _tvHorario, _tvPrecio, _tvNombre, _tvApellido, _tvCi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibo);

        _tvDestino= (TextView) findViewById(R.id.tvReDestino);
        _tvHorario= (TextView) findViewById(R.id.tvReHorario);
        _tvPrecio= (TextView) findViewById(R.id.tvRePrecio);
        _tvNombre= (TextView) findViewById(R.id.tvReNombre);
        _tvApellido= (TextView) findViewById(R.id.tvReApellido);
        _tvCi= (TextView) findViewById(R.id.tvReCi);

        Bundle bundle=getIntent().getExtras();
        String pDestino=bundle.getString("Destino");
        _tvDestino.setText(pDestino);
        String pHorario=bundle.getString("Horario");
        _tvDestino.setText(pHorario);
        String pPrecio=bundle.getString("Precio");
        _tvDestino.setText(pPrecio);
        String pNombre=bundle.getString("Nombre");
        _tvDestino.setText(pNombre);
        String pApellido=bundle.getString("Apellido");
        _tvDestino.setText(pApellido);
        String pCi=bundle.getString("Ci");
        _tvDestino.setText(pCi);
    }
}
