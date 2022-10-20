package com.app.tester;

import java.util.Scanner;
import com.app.fruits.*;


public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of basket");
		Scanner sc = new Scanner(System.in);
		Fruit[] fruitArray = new Fruit[sc.nextInt()];
		
		int counter = 0;
		System.out.println("\nEnter your choice:\n1.Add Mango\n2.Add Orange\n3.Add Apple\n4.Mark Stale\n5.Fruits in the Basket\n6.List of fresh fruits in basket\n7.Mark all sour fruits as stale\n8.Fruit Specific functionality\n9.Exit");
		int choice = sc.nextInt();
		
		while(choice != 9) {
		switch(choice) {
		case 1:
			if(counter < fruitArray.length) {
				System.out.println("Keep a mango in basket. Enter name, color and weight.");
				fruitArray[counter] = new Mango(sc.next(),sc.next(),sc.nextDouble());
				counter++;
			}
			else {
				System.out.println("Basket Full");
			}
			break;
			
		case 2:
			if(counter < fruitArray.length) {
				System.out.println("Keep a orange in basket. Enter name, color and weight.");
				fruitArray[counter] = new Orange(sc.next(),sc.next(),sc.nextDouble());
				counter++;
			}
			else {
				System.out.println("Basket Full");
			}
			break;
			
		case 3:
			if(counter < fruitArray.length) {
				System.out.println("Keep a apple in basket. Enter name, color and weight.");
				fruitArray[counter] = new Apple (sc.next(),sc.next(),sc.nextDouble());
				counter++;
			}
			else {
				System.out.println("Basket Full");
			}
			break;
			
		case 4:
			System.out.println("Enter the index on which you want to mark stale.");
			int index = sc.nextInt();
			
			if(index-1<counter) {
				fruitArray[index-1].setFresh(false);
				System.out.println(""+fruitArray[index-1].getName()+" Marked stale");
			}
			else {
				System.out.println("Invalid Index. Enter index less than "+ counter);
			}
			break;
			
		case 5:
			System.out.println("List of fruits in the basket");
			for(Fruit f: fruitArray) {
				if(f != null)
				System.out.println(f.getName()+"\n");
			}
			break;
			
		case 6:
			System.out.println("List of fresh fruits in basket");
			for(Fruit f: fruitArray) {
				if(f != null) {
					if(f.getFresh()) {
						System.out.println(f.toString());
					}
					else {
						System.out.println("No fresh fruit in the basket.");
					}
				}
				else {
					System.out.println("Invalid Index. Enter index less than "+ counter);
				}
			}
			break;
			
		case 7:
			System.out.println("Marking all sour fruits stale");
			for(int i=0;i<counter;i++) {
				if(fruitArray[i].taste().equals("Sour"))
				fruitArray[i].setFresh(false);
			}
			
		case 8:
			System.out.println("Enter the index where you want to see fruit specific functionality.");
			int ind = sc.nextInt();
			
			if(ind-1<counter) {
				if(fruitArray[ind-1] instanceof Mango) {
					((Mango)fruitArray[ind-1]).pulp();
				}
				else if(fruitArray[ind-1] instanceof Orange) {
					((Orange)fruitArray[ind-1]).juice();
				}
				else if(fruitArray[ind-1] instanceof Apple)
					((Apple)fruitArray[ind-1]).jam();
			}
			break;
			
		case 9:
			System.out.println("Exited");
			break;
		
		}//End of Switch
		
		System.out.println("Enter next operation or enter 9 to exit");
		choice = sc.nextInt();
		
		}//end of while loop
		sc.close();
	}//End of Main
}
