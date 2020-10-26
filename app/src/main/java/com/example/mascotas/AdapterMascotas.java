package com.example.mascotas;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterMascotas  extends RecyclerView.Adapter<AdapterMascotas.ViewHolderMascotas> {

    ArrayList<String> mascotas;

    public AdapterMascotas(ArrayList<String> mascotas) {
        this.mascotas = mascotas;
    }

    @NonNull
    @Override
    public ViewHolderMascotas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        return new ViewHolderMascotas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMascotas holder, int position) {
        holder.asingarDatos(mascotas.get(position));

    }


    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public class ViewHolderMascotas extends RecyclerView.ViewHolder {
        TextView mascota;
        public ViewHolderMascotas(@NonNull View itemView) {
            super(itemView);
            mascota = (TextView) itemView.findViewById(R.id.mascota);
        }

        public void asingarDatos(String s) {
            mascota.setText(s);
        }

    }
}
