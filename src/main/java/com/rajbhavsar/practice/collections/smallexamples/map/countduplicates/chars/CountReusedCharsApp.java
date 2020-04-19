package com.rajbhavsar.practice.collections.smallexamples.map.countduplicates.chars;

/**
 * Write a method to count the number of occurrences of each letter in a string.
 * For example, the string "HELLO THERE" contains two Hs, three Es, two Ls, one O, one T and one R.
 * It should return an object that contains the results – what kind of class is best suited for this?
 *
 */
public class CountReusedCharsApp
{
	public static void main(String[] args)
	{
		CountReusedCharacters countReusedCharacters = new CountReusedCharacters();
		System.out.println(countReusedCharacters.getCountsForEachChars("HELLO THERE"));
	}
}
