package arrayOperations;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array");
		Scanner sc  = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.println("Enter elements of array");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0]; int min = arr[0];
		for(int i=0; i<size; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			
			if(min>arr[i]) {
				min = arr[i];
			}
			
		}
		System.out.println("Maximum Element: "+max+"\nMinimum Element: "+min);
	}

}
