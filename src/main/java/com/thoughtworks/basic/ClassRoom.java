package com.thoughtworks.basic;

import java.util.List;

public class ClassRoom {
   private int clsNumber;
   private Teacher teacher;
   //班级里的学生集合
    private List<Student> students;

    public int getClsNumber() {
        return clsNumber;
    }

    public void setClsNumber(int clsNumber) {
        this.clsNumber = clsNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
