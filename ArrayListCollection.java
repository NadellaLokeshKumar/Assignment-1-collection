package com.ito.assignment1.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al3 = new ArrayList<String>();
		//adding names to the array list
		al.add("lokesh");
		al.add("naveen");
		al.add("subbarao");
		al.add("ratna kumari");
		System.out.println("Array list elements are: "+al);
		
		//Iteration of array list using for-each
		System.out.println("Iteration of array list using for-each:");
		for(String name : al) {
			System.out.println(name);
		}
		
		//Adding name at the first index of the array
		al.add(0, "lokesh kumar");
		System.out.println("After adding element at first index: "+al);
		
		//Retrieving a name at a specified index
		String retrive = al.get(0);
		System.out.println("Retieving element: "+retrive);
		
		//Update an array element with given element
		al.set(0, "naveen kumar");
		System.out.println("Updating an element: "+al);
		
		//to remove third element form an array list
		String remove = al.remove(2);
		System.out.println("Third element removal: "+remove);
		
		//to search an element in an array
		System.out.println("Element contains or not: "+al.contains("lokesh"));
		
		//to sort an array list
		Collections.sort(al);
		System.out.println("After sorting the array list: "+al);
		
		//to copy one array list into another array list
		ArrayList<String> al2 = (ArrayList<String>) al.clone();
		System.out.println("Cloning of one arraylist to another: "+al2);
		
		//to reverse the names in the array list
		Collections.reverse(al);
		System.out.println("Reverse of given array list: "+al);
	
		//to join two array lists
		al3.add("irfan");
		al3.add("sandeep");
		al3.add("manjunath");
		al3.add("ankith");
		System.out.println("Another array list: "+al3);
		al2.addAll(al3);
		System.out.println("Joining of two array lists: "+al2);
		
		//to empty an arraylist
		al3.removeAll(al3);
		System.out.println("making an array empty: "+al3);
		
		//to check the arraylist is empty or not
		System.out.println("Given array is empty ot not: "+al3.isEmpty());
	}
}
