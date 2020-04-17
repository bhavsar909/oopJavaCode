package com.rajbhavsar.practice.commonlogicalpractical;
/*
* 3. Write programm to find all divisors of given no.
*       eg 1. No : 50
*       expected output : 1,2,5,10,25
*
*       eg 2. No : 16
*      expected output : 1,2,4,8
*/

public class FindDivisors {
    public static void main(String[] args) {
        findDivisor(100);
    }
    public static void findDivisor(int x){
        int count = 0;
        for (int i = 1; i <= x/2; i++) {
            if (x%i == 0) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Number of Divisors:"+count);
    }
}
