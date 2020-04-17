package com.rajbhavsar.practice.oom1.example3;

import com.rajbhavsar.practice.oom1.example1.Person;


public class Shopkeeper extends Person {
    public void sells(Product product, Customer customer) {
        if (customer.getClass().getSimpleName().toString().equals("Student")){
            System.out.println(this.getName() + " sells " + product.getClass().getSimpleName() + " to " + customer.getClass().getSimpleName() + " at low cost");
        }
        else {
            System.out.println(this.getName() + " sells " + product.getClass().getSimpleName() + " to " + customer.getClass().getSimpleName());
        }
    }

}
