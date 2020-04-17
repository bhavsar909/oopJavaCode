package com.rajbhavsar.practice.oom1.example0;

public class DrivingMain {
    public static void main(String[] args) throws InterruptedException {
        Bike bike = new Bike();
        bike.model = "Activa";
        bike.number = "1234";

        Driver driver = new Driver();
        driver.name = "Vinita";
        driver.drive(bike);
    }
}
