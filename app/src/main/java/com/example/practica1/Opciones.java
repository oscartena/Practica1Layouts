package com.example.practica1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class Opciones extends AppCompatActivity {
    private ListView listView;
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opciones);

        listView = findViewById(R.id.listview);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(v -> {
            Snackbar a = Snackbar.make(v, "El botón se desplaza hacia arriba", Snackbar.LENGTH_SHORT);
            a.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
            a.show();
        });

        String[] generos = {"Accion","Aventura","Deportes","Disparos","Estrategia","Lucha","Musical","Rol","Simulacion"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, generos);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show());
    }

}
