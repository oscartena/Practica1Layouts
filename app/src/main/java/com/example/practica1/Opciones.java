package com.example.practica1;

import static java.util.List.of;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class Opciones extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opciones);

        recyclerView = findViewById(R.id.recycled);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(v -> {
            Snackbar a = Snackbar.make(v, "El botón se desplaza hacia arriba", Snackbar.LENGTH_SHORT);
            a.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
            a.show();
        });

        List<String> generos = List.of("Accion","Aventura","Deportes","Disparos","Estrategia","Lucha","Musical","Rol","Simulacion");


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GenerosAdapter adapter = new GenerosAdapter(generos);

        recyclerView.setAdapter(adapter);
    }

}
