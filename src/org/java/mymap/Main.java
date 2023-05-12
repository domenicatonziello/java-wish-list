package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

		System.out.println(Arrays.asList(str.split(" ")));
		
		
		String[] arr = str.split(" ");
		
		Map<String, Integer> myMap = new HashMap<>();
		
		for (String word : arr ) {
			
			word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			
			if (myMap.containsKey(word)) {
				myMap.put(word, myMap.get(word) + 1);
			} else {
				myMap.put(word, 1);
			}
			
			if(word.length() == 0 ) {
				myMap.remove(word);
			}
		}
		
		System.out.println(myMap);
	}

}
