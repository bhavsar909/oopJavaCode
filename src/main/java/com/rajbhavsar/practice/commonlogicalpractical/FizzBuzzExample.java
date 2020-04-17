package com.rajbhavsar.practice.commonlogicalpractical;

/*
*
*1. .Write a method that returns 'Fizz' for multiples of three and 'Buzz’ for the multiples of five. For numbers
* which are multiples of both three and five return 'FizzBuzz'.For numbers that are neither, return the input number.
* Link to verify and for more variations:
* https://www.geeksforgeeks.org/fizz-buzz-implementation/
*
* /
 */
public class FizzBuzzExample {
    public static void main(String[] args) {
        fizzBuzz(5);
        System.out.println("from 1 to 100");
        for (int i =1; i<=100;i++)
            fizzBuzz(i);
    }

    public static void fizzBuzz(int x) {
        if (x % 15 == 0)
            System.out.print("FizzBuzz ");
        else if (x % 3 == 0)
            System.out.print("Fizz ");
        else if (x % 5 == 0)
            System.out.print("Buzz ");
        else
            System.out.print(x + " ");
    }



}
