package com.rajbhavsar.practice.pizzamakingprocess.pizza.base;

import com.rajbhavsar.practice.pizzamakingprocess.Bakeable;
import com.rajbhavsar.practice.pizzamakingprocess.BakedFood;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.cheese.Cheese;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.sauces.Sauce;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.toppingsingredients.Topping;
import com.rajbhavsar.practice.pizzamakingprocess.pizza.Dough;
import com.rajbhavsar.practice.pizzamakingprocess.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Base implements Bakeable {

    private List<Sauce> sauces = new ArrayList<Sauce>();
    private List<Cheese> cheeses = new ArrayList<Cheese>();
    private List<Topping> toppings = new ArrayList<Topping>();
    private Dough dough;

    public Base(Dough dough){
        this.dough = dough;
    }

    public void setSauce(Sauce sauces) {
        this.sauces.add(sauces);
    }
    public void setCheese(Cheese cheeses) { this.cheeses.add(cheeses); }

    public void setToppings(Topping toppings){
        this.toppings.add(toppings);
    }

    public void roll(Dough dough){
        System.out.println("Rolling :" + dough.toString());
    }

    public Base spreadSauce(Sauce sauce){
        System.out.println("Spreading the "+sauce.toString());
        this.setSauce(sauce);
        return this;
    }

    public Base spreadCheese(Cheese cheese){
        System.out.println("Spreading the "+cheese.toString());
        this.setCheese(cheese);
        return this;
    }

    public Base arrange(Topping topping){
        System.out.println(topping.toString()+" is added");
        this.setToppings(topping);
        return this;
    }

    @Override
    public String toString() {
        return "Base{" +
                "sauces=" + sauces +
                ", cheeses=" + cheeses +
                ", toppings=" + toppings +
                ", dough=" + dough +
                '}';
    }

    @Override
    public BakedFood bake(double temperature) {
        Pizza pizza= new Pizza(this, temperature);
        return pizza;
    }
}
