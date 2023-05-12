package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		List<String> wishlist = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("aggiungi un desiderio");
			String userWish = sc.next();
			wishlist.add(userWish);
			System.out.println("La tua lista desideri contiene " + wishlist.size() + " desideri");
			System.out.println("Digita 1 per continuare - Digita 2 se vuoi uscire");
			int userChoise = sc.nextInt();
			if(userChoise == 1) {
				continue;
			} else {
				System.out.println("Ecco la tua lista: " + wishlist);
				break;
			}
		}
		
		sc.close();
		
	}
}
