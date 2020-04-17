package com.rajbhavsar.practice.oom1.example1;

public class Student extends Person {
    public void study(Subject subject){
        System.out.println(subject.getName()+" is studied by "+this.getName());
    }
}
