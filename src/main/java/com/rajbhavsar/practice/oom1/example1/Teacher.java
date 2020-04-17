package com.rajbhavsar.practice.oom1.example1;

public class Teacher extends Person {

    public void teach(Subject subject, Student student){
        System.out.println(this.getName()+" is teaching "+subject.getName()+" to " + student.getName());
    }
}
