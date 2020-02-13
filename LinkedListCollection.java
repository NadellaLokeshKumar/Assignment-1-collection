package com.ito.assignment1.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListCollection {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("lokesh");
		li.add("naveen");
		li.add("subbarao");
		li.add("ratna kumari");
		System.out.println("Linked list elements are: "+li);
		
		LinkedList<String> li2 = new LinkedList<String>();
		li2.add("irfan");
		li2.add("sandeep");
		li2.add("manjunath");
		li2.add("ankith");

		//to append the element at the end of list
		li.add("lokesh kumar");
		System.out.println("Appending an element at last: "+li);

		//to iterate all the elements 
		System.out.println("Iteration of linked list using iterator:");
		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		//to iterate the elements from specified index
		System.out.println("Iteration of elements from specified index: ");
		ListIterator<String> lt = li.listIterator(2);
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}

		//to iterate in reverse order
		System.out.println("Iteration of linked list in reverse order:");
		ListIterator<String> rlt = li.listIterator(li.size());
		while(rlt.hasPrevious()) {
			System.out.println(rlt.previous());
		}

		//to insert the specified element at the specified position in the linked list.
		li.add(1, "ramarao");
		System.out.println("Linked list elements are after adding at specified position: "+li);

		// to insert the specified element at the front of a linked list.
		li.addFirst("naveen kumar");
		System.out.println("Linked list elements are after adding at front position: "+li);
		
		// to insert the specified element at the end of a linked list.
		li.addLast("jogendra");
		System.out.println("Linked list elements are after adding at last position: "+li);
		
		//to display the elements and their positions in a linked list.
		for (int i = 0; i < li.size(); i++) {
			System.out.println("Element = "+li.get(i) + " at position :"+i);
		}
		
		// to remove first and last element from a linked list.
		System.out.println("removal of first element "+li.removeFirst());
		System.out.println("removal of last element "+li.removeLast());
		
		// to remove all the elements from a linked list.
		System.out.println("removal of all the elements :"+li.removeAll(li));
		
		// to join two linked lists.
		li.addAll(li2);
		System.out.println("Joining two linked lists: "+li);
		
		// to clone an linked list to another linked list.
		LinkedList<String> li3 = (LinkedList<String>) li.clone();
		System.out.println("Cloning of elements from one linked to another: "+li3);
		
		//to remove and return the first element of a linked list.
		String remove = li3.removeFirst();
		System.out.println("remove and returning the first element: "+remove);
		
		//to retrieve but does not remove, the first element of a linked list.
		String retrieve = li3.getFirst();
		System.out.println("retrieving the first element :"+retrieve);
		System.out.println(li3);
		
		//to check if a particular element exists in a linked list.
		System.out.println("Checking the element is present or not: "+li3.contains("ankith"));
		
		// to convert a linked list to array list.
		ArrayList<String> al = new ArrayList<String>(li3);
		System.out.println("Array list :"+al);
	}
}
