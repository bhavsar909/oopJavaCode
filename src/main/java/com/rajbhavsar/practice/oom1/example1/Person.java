package com.rajbhavsar.practice.oom1.example1;

import com.rajbhavsar.practice.oom1.example4.Location;
import com.rajbhavsar.practice.oom1.example4.Road;
import com.rajbhavsar.practice.oom1.example4.Vehicle;


public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void travel(Location location, Vehicle vehicle, Road road){
        System.out.println(this.getName() + " is travelling to " + location.getName() + vehicle.using(road));
    }
}
