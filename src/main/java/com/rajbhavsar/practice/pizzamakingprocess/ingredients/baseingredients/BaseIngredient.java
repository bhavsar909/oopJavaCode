package com.rajbhavsar.practice.pizzamakingprocess.ingredients.baseingredients;

import com.rajbhavsar.practice.pizzamakingprocess.ingredients.Ingredient;

public class BaseIngredient extends Ingredient {
    private double weightGm;

    public BaseIngredient(double weightGm) {
        this.weightGm = weightGm;
    }

    @Override
    public String toString() {
        return "Base Ingredients";
    }
}
