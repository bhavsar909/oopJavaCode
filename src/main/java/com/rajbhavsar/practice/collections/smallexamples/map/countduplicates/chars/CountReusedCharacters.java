package com.rajbhavsar.practice.collections.smallexamples.map.countduplicates.chars;

import java.util.HashMap;

public class CountReusedCharacters
{
	private HashMap<Character, Integer> characterIntegerHashMap= new HashMap<>();

	public HashMap<Character,Integer> getCountsForEachChars(String string){
		Integer temp;
		for (int i = 0; i < string.length(); i++)
		{
			if (characterIntegerHashMap.containsKey(string.charAt(i))){
				temp = characterIntegerHashMap.get(string.charAt(i)) + 1;
				characterIntegerHashMap.replace(string.charAt(i) , temp);
			}
			else{
				characterIntegerHashMap.put(string.charAt(i),1);
			}
		}
		return characterIntegerHashMap;
	}

}
