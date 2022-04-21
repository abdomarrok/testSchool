package com.marrok.testschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registration extends AppCompatActivity {
    private TextView Sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initwidget();
        setOnClickListeners();
    }
    void setOnClickListeners() {
        Sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Registration.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    void initwidget(){
        Sign_in = (TextView) findViewById(R.id.already_hav);
    }
}