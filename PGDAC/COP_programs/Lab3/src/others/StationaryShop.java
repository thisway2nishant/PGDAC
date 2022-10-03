package others;

import java.util.Scanner;

public class StationaryShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalAmount = 0;
		
		System.out.println("Enter items you want to buy");
		System.out.println(
				" 1:Pen($10)\n 2:Pencil($5)\n 3:Notebook($20)\n 4:Bottle($30)\n 5:ColorBox($50)\n6:Exit");

		System.out.println("-------------\n Enter your choice");
		int choice = sc.nextInt();
		
		do {
			switch(choice) {
			case 1:
				totalAmount += 10;
				break;
				
			case 2:
				totalAmount += 5;
				break;
				
			case 3:
				totalAmount += 20;
				break;
				
			case 4:
				totalAmount += 30;
				break;
				
			case 5:
				totalAmount += 50;
				break;
				
			case 6:
				break;
			}
		}while(choice != 6);
		
		System.out.println("The total amount to pay is: "+totalAmount);
	}

}
