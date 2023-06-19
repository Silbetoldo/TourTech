package com.example.tourtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastrarMateria extends AppCompatActivity {

    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_materia);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent primeirosemestre = new Intent(CadastrarMateria.this, PrimeiroSemestre.class);
                CadastrarMateria.this.startActivity(primeirosemestre);
                CadastrarMateria.this.finish();
            }
        });
    }
}