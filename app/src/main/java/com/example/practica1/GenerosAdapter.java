package com.example.practica1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GenerosAdapter extends RecyclerView.Adapter<GenerosViewHolder> {
    private List<String> datosGeneros;

    public GenerosAdapter(List<String> datosGeneros) {
        this.datosGeneros = datosGeneros;
    }

    public GenerosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_item, parent, false);
        return new GenerosViewHolder(v);
    }

    public void onBindViewHolder(GenerosViewHolder holder, int position) {
        holder.elementoTexto.setText(datosGeneros.get(position));
    }

    @Override
    public int getItemCount() {
        return datosGeneros.size();
    }
}
