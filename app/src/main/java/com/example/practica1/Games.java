package com.example.practica1;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Games extends AppCompatActivity {
    FloatingActionButton fab;
    CheckBox c1,c2,c3,c4,c5,c6,c7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games);

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);

        fab=findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opcionesSeleccionadas = "";

                if (c1.isChecked()) {
                    opcionesSeleccionadas += c1.getText();
                }
                if (c2.isChecked()) {
                    if (!opcionesSeleccionadas.isEmpty()) {
                        opcionesSeleccionadas += ", ";
                    }
                    opcionesSeleccionadas += c2.getText();
                }
                if (c3.isChecked()) {
                    if (!opcionesSeleccionadas.isEmpty()) {
                        opcionesSeleccionadas += ", ";
                    }
                    opcionesSeleccionadas += c3.getText();
                }
                if (c4.isChecked()) {
                    if (!opcionesSeleccionadas.isEmpty()) {
                        opcionesSeleccionadas += ", ";
                    }
                    opcionesSeleccionadas += c4.getText();
                }
                if (c5.isChecked()) {
                    if (!opcionesSeleccionadas.isEmpty()) {
                        opcionesSeleccionadas += ", ";
                    }
                    opcionesSeleccionadas += c5.getText();
                }
                if (c6.isChecked()) {
                    if (!opcionesSeleccionadas.isEmpty()) {
                        opcionesSeleccionadas += ", ";
                    }
                    opcionesSeleccionadas += c6.getText();
                }
                if (c7.isChecked()) {
                    if (!opcionesSeleccionadas.isEmpty()) {
                        opcionesSeleccionadas += ", ";
                    }
                    opcionesSeleccionadas += c7.getText();
                }

                if (!opcionesSeleccionadas.isEmpty()) {
                    Toast.makeText(Games.this,"Has elegido "+opcionesSeleccionadas,Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Games.this,"No has elegido ninguna opcion",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
