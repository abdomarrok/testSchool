package com.marrok.testschool;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class StudentRecAdabter extends RecyclerView.Adapter<StudentRecAdabter.ViewHolder>{
private static final String TAG="StudnetViewAdabter";
Context context;
private ArrayList<Student> students=new ArrayList<>();
public void setStudents(ArrayList<Student> students){
    this.students=students;
    notifyDataSetChanged();
        }

   public StudentRecAdabter(Context context){
        this.context=context;
        }

public StudentRecAdabter(){ }


@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.studnet_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
        }

@SuppressLint("RecyclerView")
@Override
public void onBindViewHolder(@NonNull ViewHolder holder,int position){
        Log.d(TAG,"onBindViewHolder: called");
        holder.studantName.setText(students.get(position).getFullName());
        holder.studentImg.setImageResource(R.drawable.imgfff_background);
       /** holder.parent.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View view){
        //TODO: navigate to user webview
        Intent intent=new Intent(context,WebviViewActivity.class);
        intent.putExtra("url",news.get(position).getLink());
        context.startActivity(intent);
        }
        });*/
        }


@Override
public int getItemCount(){
    return students.size();
        }


public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView studantName;
    private ImageView studentImg;
    //private CardView parent;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initWidget(itemView);
    }

    private void initWidget(View iteView) {
        studantName =(TextView) iteView.findViewById(R.id.studentName);
        studentImg = (ImageView) iteView.findViewById(R.id.student_img);
       //
    }
}
}