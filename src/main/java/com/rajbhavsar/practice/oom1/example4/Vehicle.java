package com.rajbhavsar.practice.oom1.example4;

public class Vehicle {
    private String model;
    private String regNumber;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    public String using(Road road){
        return " in "+this.getModel()+" with number "+ this.getRegNumber()+" via "+ road.getName();
    }

}
