package com.rajbhavsar.practice.collections.smallexamples.listset;
/**
 * Write a method that takes in a LinkedList and returns
 * a LinkedList object containing a copy of the first list, but in reverse order.
 */

import java.util.Collections;
import java.util.LinkedList;

public class ReverseOfInsertionOrderInLL
{
	public static void main(String[] args)
	{
		LinkedList<Object> objects = new LinkedList<>();
		objects.add("1");
		objects.add("2");
		objects.add("Raj");
		objects.add("Simran");
		objects.add("4");
		objects.add("5");

		System.out.println(reverseLL(objects));
	}

	private static LinkedList reverseLL(LinkedList<Object> linkedList)
	{
		Collections.reverse(linkedList);
		return new LinkedList<>(linkedList);
	}
}
