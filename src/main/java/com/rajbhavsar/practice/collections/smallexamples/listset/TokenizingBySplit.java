package com.rajbhavsar.practice.collections.smallexamples.listset;
/**
 * Write a method that uses a String method split to tokenize a line of text input by the user and
 * places each token in a TreeSet. It should return the TreeSet.
 *
 * Note: Printing the TreeSet should output the elements ascending sorted order.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class TokenizingBySplit
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:");
		String input = scanner.nextLine();
		System.out.println(splitAndStoreInTreeSet(input));
	}
	private static TreeSet<String> splitAndStoreInTreeSet(String input){
		return new TreeSet<>(Arrays.asList(input.split("\\s+")));
	}
}
