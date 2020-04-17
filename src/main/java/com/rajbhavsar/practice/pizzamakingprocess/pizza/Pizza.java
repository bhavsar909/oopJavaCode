package com.rajbhavsar.practice.pizzamakingprocess.pizza;
import com.rajbhavsar.practice.pizzamakingprocess.BakedFood;
import com.rajbhavsar.practice.pizzamakingprocess.pizza.base.Base;

public class Pizza extends BakedFood {
    private Base base;
    private double temperature;
    public Pizza(Base base, double temperature){
        this.temperature= temperature;
        this.base=base;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "base=" + base +
                ", temperature=" + temperature +
                '}';
    }
}
