package com.example.tourtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastrarQuiz extends AppCompatActivity {

    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_quiz);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent primeirosemestre = new Intent(CadastrarQuiz.this, PrimeiroSemestre.class);
                CadastrarQuiz.this.startActivity(primeirosemestre);
                CadastrarQuiz.this.finish();
            }
        });
    }
}