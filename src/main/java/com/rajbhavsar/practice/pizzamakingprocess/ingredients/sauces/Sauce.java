package com.rajbhavsar.practice.pizzamakingprocess.ingredients.sauces;

import com.rajbhavsar.practice.pizzamakingprocess.ingredients.toppingsingredients.Topping;

public class Sauce extends Topping {
    public Sauce(double weightGm) {
        super(weightGm);
    }

    @Override
    public String toString() {
        return "Sauce";
    }
}
