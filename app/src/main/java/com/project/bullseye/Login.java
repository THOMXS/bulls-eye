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
                //EditText txtEmail = (EditText) findViewById(R.id.txt_email);
               // EditText txtPassword = (EditText) findViewById(R.id.txt_password);
                //String email = txtEmail.getText().toString();
               // String password = txtPassword.getText().toString();

            }
        });
    }
}