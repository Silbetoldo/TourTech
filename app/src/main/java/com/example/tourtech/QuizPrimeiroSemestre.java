package com.example.tourtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizPrimeiroSemestre extends AppCompatActivity {
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_primeiro_semestre);

        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent primeirosemestre = new Intent(QuizPrimeiroSemestre.this, PrimeiroSemestre.class);
                QuizPrimeiroSemestre.this.startActivity(primeirosemestre);
                QuizPrimeiroSemestre.this.finish();
            }
        });
    }
}