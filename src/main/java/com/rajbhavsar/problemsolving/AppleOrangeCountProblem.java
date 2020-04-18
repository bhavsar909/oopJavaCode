package com.rajbhavsar.problemsolving;
/**
 *
 * Ref : url: https://www.hackerrank.com/challenges/apple-and-orange/problem
 *
 * Function Description
 *
 * Complete the countApplesAndOranges function in the editor below. It should print the number of apples and oranges that land on Sam's house, each on a separate line.
 *
 * countApplesAndOranges has the following parameter(s):
 *
 * s: integer, starting point of Sam's house location.
 * t: integer, ending location of Sam's house location.
 * a: integer, location of the Apple tree.
 * b: integer, location of the Orange tree.
 * apples: integer array, distances at which each apple falls from the tree.
 * oranges: integer array, distances at which each orange falls from the tree.
 * Input Format
 *
 * The first line contains two space-separated integers denoting the respective values of  and .
 * The second line contains two space-separated integers denoting the respective values of  and .
 * The third line contains two space-separated integers denoting the respective values of  and .
 * The fourth line contains  space-separated integers denoting the respective distances that each apple falls from point .
 * The fifth line contains  space-separated integers denoting the respective distances that each orange falls from point .
 *
 *
 *
 * Sample Input 0
 *
 * 7 11
 * 5 15
 * 3 2
 * -2 2 1
 * 5 -6
 * Sample Output 0
 *
 * 1
 * 1
 *
 */



import java.util.Scanner;


public class AppleOrangeCountProblem
{

	private static final Scanner scanner = new Scanner(System.in);

	// Complete the countApplesAndOranges function below.
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges)
	{
		int appleCount = 0;
		int orangeCount = 0;
		for (int i : apples)
		{
			if (between(s, t, i + a))
				appleCount++;
		}
		for (int i : oranges)
		{
			if (between(s, t, i + b))
				orangeCount++;
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);

	}

	static boolean between(int s, int t, int point)
	{
		return point >= s && point <= t;
	}

	public static void main(String[] args)
	{
		String[] st = scanner.nextLine().split(" ");

		int s = Integer.parseInt(st[0]);

		int t = Integer.parseInt(st[1]);

		String[] ab = scanner.nextLine().split(" ");

		int a = Integer.parseInt(ab[0]);

		int b = Integer.parseInt(ab[1]);

		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		int[] apples = new int[m];

		String[] applesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++)
		{
			int applesItem = Integer.parseInt(applesItems[i]);
			apples[i] = applesItem;
		}

		int[] oranges = new int[n];

		String[] orangesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++)
		{
			int orangesItem = Integer.parseInt(orangesItems[i]);
			oranges[i] = orangesItem;
		}

		countApplesAndOranges(s, t, a, b, apples, oranges);

		scanner.close();
	}
}

