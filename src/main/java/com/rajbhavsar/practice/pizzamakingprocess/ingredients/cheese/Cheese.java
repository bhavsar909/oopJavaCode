package com.rajbhavsar.practice.pizzamakingprocess.ingredients.cheese;

import com.rajbhavsar.practice.pizzamakingprocess.ingredients.toppingsingredients.Topping;

public class Cheese extends Topping {
    public Cheese(double weightGm) {
        super(weightGm);
    }

    @Override
    public String toString() {
        return "Cheese";
    }
}
