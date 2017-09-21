package com.das.daniel.viajeweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.das.daniel.viajeweb.Adaptadores.ListaViajeAdapter;
import com.das.daniel.viajeweb.Modelo.Viaje;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RequestQueue queue;
    String url = "http://192.168.1.4:81/viajes/viajeListado.php";
    RecyclerView recyclerView;
    List<Viaje> viajesList = new ArrayList<Viaje>();
    ListaViajeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.reciclador);
        adapter = new ListaViajeAdapter(this, viajesList, MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
        //Getting Instance of Volley Request Queue
        queue = NetworkController.getInstance(this).getRequestQueue();
        //Volley's inbuilt class to make Json array request

        cargarRecycler();
    }

    private void cargarRecycler()
    {
        JsonArrayRequest newsReq = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for ( int i= 0; i < response.length(); i++) {
                    try {

                        JSONObject obj = response.getJSONObject(i);
                        Viaje viajes = new Viaje(obj.getString("Codigo"), obj.getString("Destino"),
                                obj.getString("Horario"), obj.getDouble("Precio"),obj.getString("Flota"), obj.getString("Imagen"));

                        // añadiendo noticia a array
                        viajesList.add(viajes);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        //Notifica al adaptador sobre el cambio
                        adapter.notifyItemChanged(i);
                    }

                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println(error.getMessage());
                Toast.makeText(MainActivity.this, "Verifique el acceso a internet", Toast.LENGTH_LONG).show();
            }
        });
        //Añadiendo JsonArrayRequest a Request Queue
        queue.add(newsReq);
    }
}
