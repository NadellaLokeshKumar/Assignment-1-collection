package com.ito.assignment1.collection;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapping {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new SortByKey());
		tm.put(1, "lokesh");
		tm.put(2, "naveen");
		tm.put(5, "subbarao");
		tm.put(4, "ratna kumari");
		tm.put(3, "ratna kumari");
		System.out.println("All the data in tree map: "+tm);

		//to get all keys from the given a Tree Map.
		Set<Integer> keys = tm.keySet();
		System.out.println("Set of keys: "+keys);

		// to get the first (lowest) key and the last (highest) key currently in a map.
		System.out.println("First key in tree map: "+tm.firstKey());
		System.out.println("Last key in tree map: "+tm.lastKey());

		// to get a reverse order view of the keys contained in a given map.
		System.out.println("Keys in descending order: ");
		NavigableSet<Integer> set = tm.descendingKeySet();
		for (Integer integer : set) {
			System.out.println(integer);
		}

		// to delete all elements from a given Tree Map.
		tm.clear();
		System.out.println("After clearing the data: "+tm);
		
		// to sort keys in Tree Map by using comparator.
		
		
	}
}

class SortByKey implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		 return o1.compareTo(o2);
	}

}
