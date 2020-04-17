package com.rajbhavsar.practice.oom1.example4;

import com.rajbhavsar.practice.oom1.example1.Person;

public class TravelMain {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Tarang");
        Road road=new StateHighway();
        road.setName("Express Highway");
        Location location=new Location();
        location.setName("Baroda");
        Car car=new Car();
        car.setModel("Maruti Swift");
        car.setRegNumber("GJ1 KG 5620");
        person.travel(location, car ,road);
    }
}
