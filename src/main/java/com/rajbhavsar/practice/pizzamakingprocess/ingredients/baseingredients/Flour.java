package com.rajbhavsar.practice.pizzamakingprocess.ingredients.baseingredients;

public class Flour extends BaseIngredient {
    public Flour(double weightGm) {
        super(weightGm);
    }
    @Override
    public String toString() {
        return "Flour";
    }
}
