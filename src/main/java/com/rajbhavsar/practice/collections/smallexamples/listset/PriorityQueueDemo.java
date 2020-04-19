package com.rajbhavsar.practice.collections.smallexamples.listset;

/**
 * Create a method that takes in a variable argument of type double
 * and returns a PriorityQueue that orders the doubles in descending order
 * (i.e., 14.8 should be the highest-priority element rather than 2.2)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo
{
	public static void main(String[] args)
	{
		List<Double> list = new ArrayList<>();
		list.add(14.8);
		list.add(4.8);
		list.add(12.3);
		list.add(2.3);
		System.out.println(getDoubleInQueue(list));

	}

	private static PriorityQueue<Double> getDoubleInQueue(List<Double> doubles)
	{
		PriorityQueue<Double> doublePriorityQueue = new PriorityQueue<>(doubles.size(), Collections.reverseOrder());
		doublePriorityQueue.addAll(doubles);
		return doublePriorityQueue;
	}
}
