package com.thoughtworks.basic;

public class Teacher extends Person {
    private String job;

    public Teacher(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob() {
        this.job = job;
    }

    @Override
    public String introduce() {

        //System.out.println(super.introduce()+"I am a " + job + ".");
        return super.introduce()+" I am a " + job + ".";
    }
}
