package com.thoughtworks.basic;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String introduce() {
     System.out.println("My name is" + name + ". I am " + age + " years old.");
      //String answer = "My name is " + name + ". I am " + age + " years old.";
      return "My name is " + name + ". I am " + age + " years old.";
    }


}
