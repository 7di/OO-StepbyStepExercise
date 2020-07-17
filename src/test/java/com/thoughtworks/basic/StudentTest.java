package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void student_test() {
        ClassRoom classRoom = new ClassRoom();
        classRoom.setClsNumber(2);
        //given
        Person student = new Student("Tom", 21, classRoom);
        //when
        String talk = student.introduce();
        //then
        assertEquals(talk, "My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }
}