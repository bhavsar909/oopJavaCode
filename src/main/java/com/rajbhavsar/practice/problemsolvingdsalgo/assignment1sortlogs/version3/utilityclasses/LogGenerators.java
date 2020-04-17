package com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version3.utilityclasses;

import java.util.Random;

public class LogGenerators {
    public static String randomIdentifierGenerator(){
        int lowerLimit = 97;
        int upperLimit = 122;
        Random random = new Random();
        StringBuffer r = new StringBuffer(random.nextInt(10));

        for (int i = 0; i < r.capacity(); i++) {
            int nextRandomChar = lowerLimit
                    + (int)(random.nextFloat()
                    * (upperLimit - lowerLimit + 1));
            r.append((char)nextRandomChar);
        }
        return r.toString()+random.nextInt(1000);
    }
    public static String randomLettersGenerator(){
        int lowerLimit = 97;
        int upperLimit = 122;
        Random random = new Random();
        StringBuffer r = new StringBuffer(random.nextInt(10));
        for (int i = 0; i < r.capacity(); i++) {
            int nextRandomChar = lowerLimit
                    + (int)(random.nextFloat()
                    * (upperLimit - lowerLimit + 1));
            r.append((char)nextRandomChar);
        }
        return r.toString();
    }
}
