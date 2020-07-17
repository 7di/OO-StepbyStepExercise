package com.thoughtworks.basic;

public class Student extends Person {
    private ClassRoom classRoom;

    public Student(String name, int age, ClassRoom classRoom) {
        super(name, age);
        this.classRoom = classRoom;
    }

    public void setClassNumber() {
        this.classRoom = classRoom;
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student of Class "+ classRoom.getClsNumber()+".";
    }
}
