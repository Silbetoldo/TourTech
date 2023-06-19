package com.example.tourtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
 Button btnLogin, btnPrimeiroAcesso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnPrimeiroAcesso = (Button) findViewById(R.id.btnPrimeiroAcesso);

    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent semestre = new Intent(Login.this, Semestre.class);
            Login.this.startActivity(semestre);
            Login.this.finish();
        }
    });

    btnPrimeiroAcesso.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent primeiroacesso = new Intent(Login.this,
                                                  PrimeiroAcesso.class);
            Login.this.startActivity(primeiroacesso);
            Login.this.finish();
        }
    });

    }
}