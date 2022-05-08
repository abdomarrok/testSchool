package com.marrok.testschool;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {
    private static final String TAG = "StudentActivity";
    private TextView total;
    private ArrayList<Student> student;
    private RecyclerView recyclerView;
    private StudentRecAdabter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Log.d(TAG, "onCreate: set view done");

        //add value to the student model
        student = new ArrayList<>();
        for(int i=1;i<20;i++){
            student.add(new Student(i,"said"+((Integer)i).toString()));
        }

        // widget initialitation
        recyclerView =(RecyclerView)findViewById(R.id.student_recycler_view);
        total=(TextView) findViewById(R.id.total_value);
        adapter= new StudentRecAdabter(this);//create adapter instance
        recyclerView.setAdapter(adapter);//set the Student model adapter to recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // chose tha way to show item
        adapter.setStudents(student);// giving the model to the adapter
        ///////////////
        total.setText(((Integer)adapter.getItemCount()).toString());

    }
}