package com.rajbhavsar.practice.pizzamakingprocess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PizzaStyle {
    private List<String> toppings = new ArrayList<String>();
    private List<String> cheeses= new ArrayList<String>();
    private List<String> sauces=  new ArrayList<String>();

    PizzaStyle(String[] sauces, String[] cheeses, String[] toppings) {
        Collections.addAll(this.sauces, sauces);
        Collections.addAll(this.cheeses, cheeses);
        Collections.addAll(this.toppings, toppings);
    }

    public List<String> getToppings() {
        return toppings;
    }

    public List<String> getCheeses() {
        return cheeses;
    }

    public List<String> getSauces() {
        return sauces;
    }
}
