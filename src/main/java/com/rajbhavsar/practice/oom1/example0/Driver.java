package com.rajbhavsar.practice.oom1.example0;

public class Driver extends Person {
    public void drive(Bike bike) throws InterruptedException {
        bike.start();
        System.out.println(name+" is driving "+bike.model +" with number "+bike.number);
        Thread.sleep(3000L);
        bike.stop();
    }
}
