package com.project.bullseye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

//        Button btnSave = (Button) findViewById(R.id.btn_login;
//
//        btnSave.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                EditText txtName = (EditText) findViewById(R.id.txt_nome);
//
//                EditText txtEmail = (EditText) findViewById(R.id.txt_email);
//
//                String Name = txtName.getText().toString();
//
//                String Email = txtEmail.getText().toString();
//
//                if( Name.equals("") || Email.equals("")){
//
//                    Intent intentSignUpError = new Intent(SignUp.this, SignUpError.class);
//                    startActivity(intentSignUpError);
//                } else {
//                    Intent intentSignUpSuccess = new Intent(SignUp.this, SignUpSuccess.class);
//                    intentSignUpSuccess.putExtra("Name", Name);
//                    startActivity(intentSignUpSuccess);
//                }
//            }
//        });
    }
}