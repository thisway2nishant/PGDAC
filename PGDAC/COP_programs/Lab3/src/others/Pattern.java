package others;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the max number of stars you want in a row");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
