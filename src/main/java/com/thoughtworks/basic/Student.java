package com.thoughtworks.basic;

public class Student extends Person {
    private int classNumber;

    public Student(String name, int age, int classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber() {
        this.classNumber = classNumber;
    }

    @Override
    public String introduce() {
        super.introduce();
        System.out.println(" I am a Student of Class"+classNumber+".");
        return null;
    }
}
