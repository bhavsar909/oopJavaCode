package com.rajbhavsar.practice.oom1.example2;

import com.rajbhavsar.practice.oom1.example1.Person;


public class Servant extends Person {
    public void serve(Beverage beverage){
        System.out.println(this.getName() +" is serving " + beverage.getName());
    }
}
