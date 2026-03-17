package com.example.oop.student;

public class Student {

    private int studentId;
    private String name;
    private int age;
    private String major;

    public Student(int studentId, String name, int age, String major) {
        this.studentId = studentId;
        this.name = name;
        setAge(age);
        this.major = major;
    }

    // Getters
    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getMajor() { return major; }

    // Setters
    public void setName(String name) { this.name = name; }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        }
    }

    public void setMajor(String major) {
        this.major = major;
    }
}