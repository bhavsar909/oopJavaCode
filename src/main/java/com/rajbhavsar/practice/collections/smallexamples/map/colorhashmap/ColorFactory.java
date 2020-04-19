package com.rajbhavsar.practice.collections.smallexamples.map.colorhashmap;

import java.util.HashMap;

public class ColorFactory
{
	private HashMap<String, Color> colorMap = new HashMap<>();

	public ColorFactory()
	{
		colorMap.put("WHITE", Color.WHITE);
		colorMap.put("SAFFRON", Color.SAFFRON);
		colorMap.put("CREAM", Color.CREAM);
		colorMap.put("LIGHT_RED", Color.LIGHT_RED);
		colorMap.put("ORANGE", Color.ORANGE);
		colorMap.put("GRAY", Color.GRAY);
		colorMap.put("YELLOW", Color.YELLOW);
		colorMap.put("BLUE", Color.BLUE);
		colorMap.put("GREEN", Color.GREEN);
		colorMap.put("RED", Color.RED);
		colorMap.put("PINK", Color.PINK);
		colorMap.put("DARK_BLUE", Color.DARK_BLUE);
		colorMap.put("BLACK", Color.BLACK);
	}

	public Color getColor(String color){
		return colorMap.get(color);
	}

	public HashMap getColors(){
		return colorMap;
	}
}
