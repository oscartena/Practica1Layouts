package com.example.practica1;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AboutViewHolder extends RecyclerView.ViewHolder{
    protected ImageView imageView;
    protected TextView nameView;
    protected TextView yearView;
    protected LinearLayout linearLayout;

    public AboutViewHolder(@NonNull View view) {
        super(view);
        imageView = view.findViewById(R.id.aboutImage);
        nameView = view.findViewById(R.id.aboutTitle);
        yearView = view.findViewById(R.id.aboutYear);
        linearLayout = view.findViewById(R.id.aboutLayout);
    }
}
