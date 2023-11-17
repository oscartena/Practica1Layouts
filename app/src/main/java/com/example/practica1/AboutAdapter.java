package com.example.practica1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AboutAdapter extends RecyclerView.Adapter<AboutViewHolder>{
    private List<Integer> imagenes;
    private List<String> nombres;
    private List<String> years;

    public AboutAdapter(List<Integer> imagenes, List<String> nombres, List<String> years) {
        this.imagenes = imagenes;
        this.nombres = nombres;
        this.years = years;
    }

    @Override
    public AboutViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.about_item, parent, false);
        return new AboutViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AboutViewHolder holder, int position) {
        holder.imageView.setImageResource(imagenes.get(position));
        holder.nameView.setText(nombres.get(position));
        holder.yearView.setText(years.get(position));

        holder.linearLayout.setOnClickListener(view -> Toast.makeText(view.getContext(), "Has pulsado " + nombres.get(position), Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return imagenes.size();
    }
}
