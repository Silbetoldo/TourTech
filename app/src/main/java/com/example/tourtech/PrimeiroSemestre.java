package com.example.tourtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrimeiroSemestre extends AppCompatActivity {

    Button btnQuiz, btnVoltar;
    TextView txtCadastrarMateria, txtCadastraQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiro_semestre);
        btnQuiz = (Button) findViewById(R.id.btnQuiz);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);
        txtCadastrarMateria = (TextView) findViewById(R.id.txtCadastrarMateria);
        txtCadastraQuiz = (TextView) findViewById(R.id.txtCadastraQuiz);

        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(PrimeiroSemestre.this, QuizPrimeiroSemestre.class);
                PrimeiroSemestre.this.startActivity(quiz);
                PrimeiroSemestre.this.finish();
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent semestre = new Intent(PrimeiroSemestre.this, Semestre.class);
                PrimeiroSemestre.this.startActivity(semestre);
                PrimeiroSemestre.this.finish();
            }
        });

        txtCadastrarMateria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cadastrarmateria = new Intent(PrimeiroSemestre.this, CadastrarMateria.class);
                PrimeiroSemestre.this.startActivity(cadastrarmateria);
                PrimeiroSemestre.this.finish();
            }
        });
        txtCadastraQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cadastrarquiz = new Intent(PrimeiroSemestre.this, CadastrarQuiz.class);
                PrimeiroSemestre.this.startActivity(cadastrarquiz);
                PrimeiroSemestre.this.finish();
            }
        });
    }
}