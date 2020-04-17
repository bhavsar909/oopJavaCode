package com.rajbhavsar.practice.oom1.example3;

public class ShopMain {
    public static void main(String[] args) {
        Shopkeeper shopkeeper=new Shopkeeper();
        shopkeeper.setName("Bill");
        Laptop laptop=new Laptop();
        laptop.setModel("Lenovo E470");
        Student student=new Student();
        student.setName("Student1");
        shopkeeper.sells(laptop,student);
        Customer customer=new Customer();
        shopkeeper.sells(laptop,customer);
    }
}
