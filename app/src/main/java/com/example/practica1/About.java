package com.example.practica1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class About extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Integer> imagenes = List.of(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8);
    private List<String> nombres = List.of("María Mata","Antonio Sanz","Carlos", "Berta", "Héctor Campos", "Ismael", "Juan Carlos", "Isabel");
    private List<String> years = List.of("2014", "1890", "967", "945", "879", "678", "669", "420");
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        recyclerView = findViewById(R.id.aboutRecycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AboutAdapter adapter = new AboutAdapter(imagenes, nombres, years);
        recyclerView.setAdapter(adapter);

    }
}
