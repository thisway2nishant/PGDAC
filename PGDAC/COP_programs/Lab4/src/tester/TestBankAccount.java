package tester;
import java.util.Scanner;

import objects_and_classes.BankAccount;
public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------Welcome----------");
		System.out.println("\nPlease choose an Option");
		System.out.println("\n1.Show Information\n2.Deposit Money\n3.Withdraw Money\n4.Show Balance\n5.Exit");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		BankAccount ac1 = new BankAccount("Nishant", 50000, 7860);
		//BankAccount ac2 = new BankAccount("Sufiyan", 60000, 4568);
		
		do {
			switch(choice) {
			case 1:
				ac1.showInfo();
				break;
				
			case 2:
				System.out.println("\nEnter amount you want to deposit to account1");
				ac1.deposit(sc.nextInt());
				break;
				
			case 3:
				System.out.println("\nEnter amount you want to withdraw from account1");
				ac1.withdraw(sc.nextInt());
				break;
				
				
			case 4:
//				System.out.println("\nBalance in account2");
//				ac2.showBalance();
				System.out.println("\nBalance in account1");
				ac1.showBalance();
				break;
				
			case 5:
				break;
		}
		
		System.out.println("\nEnter choice or enter 5 to exit");
		choice = sc.nextInt();
		
	}while(choice!=5);
		

	}
}
