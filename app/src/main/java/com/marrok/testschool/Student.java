package com.marrok.testschool;

public class Student{
    String fullName;
    int Img_id;

    public Student(int img_id,String fullName) {
        this.fullName = fullName;
        Img_id = img_id;
    }
    public Student(String fullName) {
        this.fullName = fullName;
        Img_id = 1;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getImg_id() {
        return Img_id;
    }

    public void setImg_id(int img_id) {
        Img_id = img_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", Img_id=" + Img_id +
                '}';
    }
}
