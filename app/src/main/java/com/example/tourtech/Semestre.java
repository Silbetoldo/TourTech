package com.example.tourtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Semestre extends AppCompatActivity {

    TextView txtSemestre1;
    FloatingActionButton fabVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semestre);

        txtSemestre1 = (TextView) findViewById(R.id.txtSemestre1);
        fabVoltar = (FloatingActionButton) findViewById(R.id.fabVoltar);

        txtSemestre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent primeirosemestre = new Intent(Semestre.this,
                                                          PrimeiroSemestre.class);
                Semestre.this.startActivity(primeirosemestre);
                Semestre.this.finish();
            }
        });

        fabVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(Semestre.this, Login.class);
                Semestre.this.startActivity(login);
                Semestre.this.finish();
            }
        });
    }
}