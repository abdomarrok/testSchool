package com.marrok.testschool;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    
    private  Button getstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initwidget();
        setOnClickListeners();
    }

     void setOnClickListeners() {

        getstart.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                //setContentView(R.layout.activity_login);
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    void initwidget(){
            getstart = (Button) findViewById(R.id.get_started);
    }
}