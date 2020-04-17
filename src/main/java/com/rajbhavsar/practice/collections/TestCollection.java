package com.rajbhavsar.practice.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        Collection<Object> collection = new ArrayList<Object>();
        collection.add(10);
        collection.add('a');
        collection.add("Sanjay");
        collection.add("Dhutrastra");

        System.out.println(collection.toString());

        System.out.println(collection.contains("sanjay"));


    }
}
