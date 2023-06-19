package com.example.Student_managment_portal;




public class Student {
    private int admnNo ;
    private String name;
    private int age;
    private String course ;

    public Student() {
    }

    public Student(int admnNo, String name, int age, String course) {
        this.admnNo = admnNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(int admnNo) {
        this.admnNo = admnNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
