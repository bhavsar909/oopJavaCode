package com.rajbhavsar.practice.collections.smallexamples.map.colorhashmap;

/**
 * Use a HashMap to create a reusable class for choosing one of the 13 predefined colors in class Color.
 * The names of the colors should be used as keys, and the predefined Color  objects should be used as values.
 * It should return the HashMap.
 */
public class ColorMain
{
	public static void main(String[] args)
	{
		ColorFactory colorFactory = new ColorFactory();
		System.out.println(colorFactory.getColors());
		System.out.println(colorFactory.getColor("WHITE"));
	}
}
