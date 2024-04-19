package com.example.lista;

import android.content.Context;
import android.view.LayoutInflater;

public class AdapterPlanetas extends ArrayAdapter<> {


    public AdapterPlanetas(Context context, int resource, Object[] objects){
        super(context, resource, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View itemlista = LayoutInflater.from(getContext()).inflate(R.layout.item_lista_planeta,)
        TextView tv = itemlista.findViewById(R.id.textViewNomePlaneta);
        Planet getItem(position);
                return
    }
}
