package com.project.bullseye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText txtEmail = (EditText) findViewById(R.id.txt_email);
                EditText txtPassword = (EditText) findViewById(R.id.txt_password);
                String email = txtEmail.getText().toString();
                String password = txtPassword.getText().toString();
                if (email.equals("vittoria_thomasini@acad.ftec.com.br") == true && password.equals("123456") == true) {
                    Intent intentLoginSuccess = new Intent(Login.this, LoginSuccess.class);
                    startActivity(intentLoginSuccess);
                } else {
                    Intent intentLoginError = new Intent(Login.this, LoginError.class);
                    startActivity(intentLoginError);
                }
            }
        });
    }
}