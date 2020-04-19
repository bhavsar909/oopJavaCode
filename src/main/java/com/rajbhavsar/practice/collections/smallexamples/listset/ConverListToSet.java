package com.rajbhavsar.practice.collections.smallexamples.listset;
/**
 * Write a method that reads in a series of first names
 * and eliminates duplicates by storing them in a Set. It should return the Set.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConverListToSet
{
	public static void main(String[] args)
	{
		List<String> fNames=new ArrayList<>();
		fNames.add("Raj");
		fNames.add("Raj");
		fNames.add("John");
		fNames.add("Raj");
		fNames.add("Clara");
		fNames.add("Raj");

		System.out.println(fNames);
		System.out.println(removeDuplicates(fNames));
	}

	public static Set<String> removeDuplicates(List<String> fName){
		return new HashSet<String>(fName);
	}

}
