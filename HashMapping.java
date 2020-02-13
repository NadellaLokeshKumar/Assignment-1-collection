package com.ito.assignment1.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapping {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "lokesh");
		hm.put(2, "naveen");
		hm.put(3, "subbarao");
		hm.put(4, "ratna kumari");
		
		//  to iterate over all the entries in the HashMap. 
		for (Map.Entry<Integer, String> kv : hm.entrySet()) {
			System.out.println(kv.getKey() +" = "+kv.getValue());
		}
		
		//to get the specified value with the specified key in a HashMap.
		System.out.println("Value of a given key is: "+hm.get(2));
		
		// to count the number of key-value (size) mappings in a map.
		System.out.println("Size of the hash map is: "+hm.size());
		
		//to copy all of the mappings from the specified map to another map.
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		hm2 = (HashMap<Integer, String>) hm.clone();
		System.out.println("coping from one hash set to another: "+hm2);
		
		//   to remove all of the mappings from a map.
		System.out.println("Removing all the mappings from map: ");
		 hm2.clear();
		 System.out.println(hm2);
		 
		 //to test if a map contains a mapping for the specified key.
		 System.out.println("Map contains specified key or not: "+hm.containsKey(2));
		 
		 //to test if a map contains a mapping for the specified value.
		 System.out.println("Map contains specified value or not: "+hm.containsValue("lokesh"));
		 
		 //to get the value of a specified key in a map.
		 System.out.println("Value of a specified key: "+hm.get(2));
		 
		 //to get a set view of the keys contained in this map.
		 Set<Integer> keys = hm.keySet();
		 System.out.println("set of keys: "+keys);
		 
		 // to get a collection view of the values contained in this map.
		 Collection<String> values = hm.values();
		 System.out.println("Collection of values: "+values);
	}
}
