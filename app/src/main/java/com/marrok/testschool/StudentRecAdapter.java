package com.marrok.testschool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.marrok.testschool.Models.Student;

import java.util.ArrayList;

/**
 *  outer class inherit RecyclerView.Adapter specifying the the genratore  <StudentRecAdapter.ViewHolder>
 */
public class StudentRecAdapter extends RecyclerView.Adapter<StudentRecAdapter.ViewHolder> {
    private static final String TAG = "StudentViewAdapter";
    Context context;  //the student activity StudentActivity.java
    private ArrayList<Student> students = new ArrayList<>(); //array list holds the model items

    //the outer class constructor
    public StudentRecAdapter(Context context) {
        this.context = context;
    }
    public StudentRecAdapter() {
    }
    // inner class inherit  RecyclerView.ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView studantName;
        private ImageView studentImg;
        private CardView parent_cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            initWidget(itemView);
        }
        private void initWidget(View iteView) {
            studantName = (TextView) iteView.findViewById(R.id.studentName);
            studentImg = (ImageView) iteView.findViewById(R.id.student_img);
            parent_cardView = (CardView) iteView.findViewById(R.id.m_student_cardview);
        }
    }
    // add the student setter to the class adapter
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
        notifyDataSetChanged();
    }


    /**  methods  need to be implemented   */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.studnet_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.studantName.setText(students.get(position).getFullName());
        holder.studentImg.setImageResource(R.drawable.imgfff_background);
         holder.parent_cardView.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
        Intent intent=new Intent(context,ProfileActivity.class);
        context.startActivity(intent);
        }
        });
    }


    @Override
    public int getItemCount() {
        return students.size();
    }

}