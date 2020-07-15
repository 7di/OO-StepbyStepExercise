package com.thoughtworks.basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
            public void person_test(){
        //given
        Person person =new Person("Tom",21);
        //when
        String talk = person.introduce();
        //then
        assertEquals(talk,"My name is Tom. I am 21 years old.");
    }


}