package com.rajbhavsar.practice.pizzamakingprocess;

import com.rajbhavsar.practice.pizzamakingprocess.pizza.Pizza;

public class PizzaCutter {
    public Pizza cut(Pizza pizza){
        System.out.println("cutting");
        return pizza;
    }

    @Override
    public String toString() {
        return "Pizza Cutter";
    }
}
