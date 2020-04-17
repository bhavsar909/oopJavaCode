package com.rajbhavsar.practice.pizzamakingprocess.pizza;

import com.rajbhavsar.practice.pizzamakingprocess.ingredients.baseingredients.BaseIngredient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dough {

    private List<BaseIngredient> baseIngredients= new ArrayList<BaseIngredient>();
    public Dough(BaseIngredient[] baseIngredients){
        Collections.addAll(this.baseIngredients, baseIngredients);
    }

    @Override
    public String toString() {
        return "Dough{" +
                "baseIngredients=" + baseIngredients +
                '}';
    }
}
