package com.ito.assignment1.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("lokesh");
		hs.add("naveen");
		hs.add("subbarao");
		hs.add("ratna kumari");
		hs.add("irfan");
		hs.add("lokesh");        // duplicates not allowed
		System.out.println(hs);  // insertion order is not preserved
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("lokesh");
		hs2.add("naveen");
		hs2.add("subbarao");
		hs2.add("ratna kumari");

		//to iterate through all elements in a hash list.
		System.out.println("elements in hash set are: ");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		// to get the number of elements in a hash set.
		System.out.println("Size of the given hashset: "+hs.size());

		//to convert a hash set to an array.
		Object[] arr = hs.toArray();
		System.out.println("Array elements are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// to convert a hash set to a List/ArrayList.
		ArrayList<String> al = new ArrayList<String>(hs);
		System.out.println("Array list elements are: "+al);
		
		// to compare two hash set.
		System.out.println("Comparing two hashsets: "+hs.containsAll(hs2));
		
		// to compare two sets and retain elements which are same on both sets.
		System.out.println("Retaining elements: ");
		hs.retainAll(hs2);
		System.out.println(hs);

		// to empty an hash set.
		hs.clear();
		System.out.println("Empty hash set hs1 : "+hs);

		// to remove all of the elements from a hash set.
		System.out.println("Removing all the elements in hs2:"+hs2.removeAll(hs2));
		System.out.println("hash set of hs2: "+hs2);
	}
}
