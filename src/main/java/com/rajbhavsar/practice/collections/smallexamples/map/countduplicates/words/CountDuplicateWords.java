package com.rajbhavsar.practice.collections.smallexamples.map.countduplicates.words;

import java.util.HashMap;

public class CountDuplicateWords
{
	private HashMap<String, Integer> characterIntegerHashMap= new HashMap<>();

	public HashMap<String,Integer> getCountsForEachWord(String string){
		String[] tokens = string.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+");

		Integer temp;
		for (int i = 0; i < tokens.length; i++)
		{
			if (characterIntegerHashMap.containsKey(tokens[i])){
				temp = characterIntegerHashMap.get(tokens[i]) + 1;
				characterIntegerHashMap.replace(tokens[i] , temp);
			}
			else{
				characterIntegerHashMap.put(tokens[i],1);
			}
		}
		return characterIntegerHashMap;
	}

}
