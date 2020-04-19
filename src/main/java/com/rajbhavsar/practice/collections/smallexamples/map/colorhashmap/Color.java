package com.rajbhavsar.practice.collections.smallexamples.map.colorhashmap;

public class Color
{
	private String color;
	private String colorCode="XXX";

	@Override
	public String toString()
	{
		return "Color{" +
				"color='" + color + '\'' +
				", colorCode=" + colorCode +
				'}';
	}

	public Color(String color){
		this.color= color;
	}

	public static final Color WHITE = new Color("WHITE");
	public static final Color BLUE = new Color("BLUE");
	public static final Color GREEN = new Color("GREEN");
	public static final Color BLACK = new Color("BLACK");
	public static final Color ORANGE = new Color("ORANGE");
	public static final Color RED = new Color("RED");
	public static final Color PINK = new Color("PINK");
	public static final Color CREAM = new Color("CREAM");
	public static final Color SAFFRON = new Color("SAFFRON");
	public static final Color GRAY = new Color("GRAY");
	public static final Color YELLOW = new Color("YELLOW");
	public static final Color LIGHT_RED = new Color("LIGHT_RED");
	public static final Color DARK_BLUE = new Color("DARK_BLUE");
}
