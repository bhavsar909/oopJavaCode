package com.rajbhavsar.practice.pizzamakingprocess;
import com.rajbhavsar.practice.pizzamakingprocess.pizza.Pizza;

public class PizzariaMain {
    public static void main(String[] args) throws InterruptedException {
        Chef chef = new Chef();

        PizzaStyle pizzaStyle= new PizzaStyle(new String[]{"sauce"}, new String[]{"cheese"} , new String[]{"corn","olive"});

        Pizza pizza = chef.makePizza(pizzaStyle);

        System.out.println("Pizza : " +pizza.toString());
    }
}
