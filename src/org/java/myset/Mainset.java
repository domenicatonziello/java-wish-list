package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Mainset {
	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<>();
		Random random = new Random();
		
		for (int i = 1; i <=5 ; i++) {
			
			int randomNumber = random.nextInt(2, 12);
			mySet.add(randomNumber);
		}
		
		System.out.println(mySet);
	}
}
