package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Preferences extends AppCompatActivity {
    RadioGroup radioGroup;
    RatingBar ratingBar;
    SeekBar seekBar;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);

        radioGroup = findViewById(R.id.radioGroup);
        ratingBar = findViewById(R.id.ratingBar);
        seekBar = findViewById(R.id.seekBar);
        fab = findViewById(R.id.fab);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                int seekBarProgress = (int) ((rating / ratingBar.getNumStars()) * seekBar.getMax());
                seekBar.setProgress(seekBarProgress);
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float rating = (float) progress / seekBar.getMax() * ratingBar.getNumStars();
                ratingBar.setRating(rating);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numBotonElegido = radioGroup.getCheckedRadioButtonId();
                RadioButton botonElegido = findViewById(numBotonElegido);
                if (botonElegido==null) {
                    Toast.makeText(Preferences.this, "No has pulsado ninguna opción", Toast.LENGTH_SHORT).show();
                }
                else{
                    String opcionElegida = botonElegido.getText().toString();
                    float puntuacion = ratingBar.getRating();

                    Toast.makeText(Preferences.this,opcionElegida+" Puntuacion "+puntuacion, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}