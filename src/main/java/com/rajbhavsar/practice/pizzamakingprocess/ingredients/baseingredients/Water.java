package com.rajbhavsar.practice.pizzamakingprocess.ingredients.baseingredients;

public class Water extends BaseIngredient {
    public Water(double weightGm) {
        super(weightGm);
    }

    @Override
    public String toString() {
        return "water";
    }
}
