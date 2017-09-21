package com.das.daniel.viajeweb.Adaptadores;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.das.daniel.viajeweb.ItemClickListener;
import com.das.daniel.viajeweb.Modelo.Viaje;
import com.das.daniel.viajeweb.R;
import com.das.daniel.viajeweb.ReporteActivity;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Pattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Daniel on 16/09/2017.
 */
public class ListaViajeAdapter extends RecyclerView.Adapter<ListaViajeAdapter.MyViewHolder> implements  Validator.ValidationListener{

    private List<Viaje> viajesList;
    private Context context;
    private LayoutInflater inflater;
    Activity mActivity;




    Validator validator;


    public ListaViajeAdapter(Context context, List<Viaje> viajesList, Activity mActivity) {

        this.context = context;
        this.viajesList = viajesList;
        this.mActivity=mActivity;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View rootView = inflater.inflate(R.layout.items_viaje, parent, false);
        return new MyViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final Viaje viajes = viajesList.get(position);
        //Pass the values of feeds object to Views
     //   holder._tvCodigo.setText("Código: "+viajes.getCodigo());






        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                //OPEN DETAIL ACTIVITY
                //PASS DATA



            }
        });

    }

    @Override
    public int getItemCount() {
        return viajesList.size();
    }



    private void mostrarDialogo()
    {
        validator = new Validator(this);
        validator.setValidationListener(this);
        final Dialog d = new Dialog(context);
        d.setContentView(R.layout.nueva_reserva);

        d.show();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView _tvCodigo


        ItemClickListener itemClickListener;

        public MyViewHolder(View itemView) {
            super(itemView);

           // _tvCodigo = (TextView) itemView.findViewById(R.id.tvCodigo);

            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            this.itemClickListener.onItemClick(view,getLayoutPosition());
        }
        public void setItemClickListener(ItemClickListener ic)
        {
            this.itemClickListener=ic;
        }
    }
}
