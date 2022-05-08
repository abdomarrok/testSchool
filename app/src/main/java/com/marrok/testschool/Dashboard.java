package com.marrok.testschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    private static final String TAG = "Dashboard";
    private TextView studenttxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ok");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);
        studenttxt=(TextView) findViewById(R.id.student);
        studenttxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                Intent intent=new Intent(Dashboard.this,StudentActivity.class);
                startActivity(intent);
            }
        });
    }
    }
