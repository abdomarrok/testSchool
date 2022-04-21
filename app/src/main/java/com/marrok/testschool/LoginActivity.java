package com.marrok.testschool;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private TextView Register;
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initwidget();
        setOnClickListeners();

    }

    void setOnClickListeners() {
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,Registration.class);
               startActivity(intent);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,Dashbord.class);
                startActivity(intent);
            }
        });
    }

    void initwidget(){

        Register = (TextView) findViewById(R.id.Register_txt);
        btnLogin =(Button) findViewById(R.id.btnLogin);
    }
}