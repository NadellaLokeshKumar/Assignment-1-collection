package com.ito.assignment1.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(50);
		ts.add(20);
		ts.add(40);
		ts.add(5);
		ts.add(1);
		ts.add(7);
		
		//to iterate through all elements in a tree set.
		System.out.println("Tree set elements are: ");
		for (Integer integer : ts) {
			System.out.println(integer);
		}
		
		//to add all the elements of a specified tree set to another tree set.
		TreeSet<Integer> ts2 = new TreeSet<Integer>(ts);
		System.out.println("Added elements from ts1 to ts2: "+ts2);
		
		//to create a reverse order view of the elements contained in a given tree set.
		System.out.println("Reverse order view of tree set: ");
		Iterator<Integer> it = ts.descendingIterator();
		while(it.hasNext())
		System.out.println(it.next());
		
		// to get the first and last elements in a tree set.
		System.out.println("First element of the tree set: "+ts.first());
		System.out.println("Last element of the tree set: "+ts.last());
		
		//to get the number of elements in a tree set.
		System.out.println("Number of elements in th tree set: "+ts.size());
		
		//to find the numbers less than 7 in a tree set.
		TreeSet<Integer> ts3 = (TreeSet<Integer>) ts.headSet(7);
		System.out.println("numbers less than 7: "+ts3);
		
		//to get the element in a tree set which is greater than or equal to the given element.
		System.out.println("number greater than or equal to given element: "+ts.ceiling(20));
		
		//to retrieve and remove the first element of a tree set.
		System.out.println("Retrive and remove of first element in tree set: "+ts.pollFirst());
		
		//to retrieve and remove the last element of a tree set.
		System.out.println("Retrive and remove of last element in tree set: "+ts.pollLast());
		
		//to remove a given element from a tree set.
		System.out.println("Removing a given element in tree set: "+ts.remove(20));
		System.out.println("After doing the before operations tree set becomes: "+ts);
	}
}
