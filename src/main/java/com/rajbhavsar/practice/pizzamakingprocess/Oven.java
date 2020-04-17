package com.rajbhavsar.practice.pizzamakingprocess;

public class Oven {
    public BakedFood bake(Bakeable bakeable) throws InterruptedException {
        System.out.println(bakeable.toString()+" is in oven for baking ");
        Thread.sleep(5000);
        System.out.println(bakeable.toString()+" is Baked, so now pizza is ready...");
        return bakeable.bake(150);
    }
}
