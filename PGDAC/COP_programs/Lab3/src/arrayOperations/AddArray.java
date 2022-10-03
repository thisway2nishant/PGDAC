package arrayOperations;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter rows and column:");
		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int[][] arr1 = new int[rows][columns];
		int[][] arr2 = new int[rows][columns];
		int[][] arr3 = new int[rows][columns];

		System.out.println("enter elements of first array:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr1[i][j] = sc.nextInt();
			}

		}
		System.out.println("enter elements of second array:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr2[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(" " + arr3[i][j]);
			}
			System.out.println(" ");
		}
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < columns; j++) {
//				System.out.print(" " + arr3[i][j]);
//			}
//			System.out.println(" ");
//		}

	}

}
