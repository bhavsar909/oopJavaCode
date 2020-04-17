package com.rajbhavsar.practice.pizzamakingprocess.ingredients.toppingsingredients;

import com.rajbhavsar.practice.pizzamakingprocess.ingredients.Ingredient;

public class Topping extends Ingredient
{
    private double weightGm;
    public Topping(double weightGm){
        weightGm = weightGm;
    }


    @Override
    public String toString() {
        return "Toppings";
    }
}
