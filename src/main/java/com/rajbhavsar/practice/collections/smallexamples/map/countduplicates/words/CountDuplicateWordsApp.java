package com.rajbhavsar.practice.collections.smallexamples.map.countduplicates.words;

/**
 * Write a method that returns the number of duplicate words in a sentence.
 * Treat uppercase and lowercase letters the same. Ignore punctuation.
 */

public class CountDuplicateWordsApp
{
	public static void main(String[] args)
	{
		CountDuplicateWords countDuplicateWords = new CountDuplicateWords();
		System.out.println(countDuplicateWords.getCountsForEachWord("HELLO RAJ, Raj is working on weekend. and on this weekend there is lockdown in world because of Covid-19. INDIA is fighting against COVID-19!!! Take care of your self and be safe in home!!! Are you have enough food to eat??"));
	}
}
