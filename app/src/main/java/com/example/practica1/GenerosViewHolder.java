package com.example.practica1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GenerosViewHolder extends RecyclerView.ViewHolder{
    protected TextView elementoTexto;

    public GenerosViewHolder(@NonNull View view) {
        super(view);
        elementoTexto = view.findViewById(R.id.genero);
    }
}
