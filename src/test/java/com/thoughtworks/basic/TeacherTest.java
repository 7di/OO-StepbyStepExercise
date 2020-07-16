package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
    @Test
    public void teacher_test() {
        //given
        Teacher teacher = new Teacher("Matt", 30, "teacher");
        //when
        String talk = teacher.introduce();
        //then
        assertEquals(talk, "My name is Matt. I am 30 years old. I am a teacher.");
    }
}