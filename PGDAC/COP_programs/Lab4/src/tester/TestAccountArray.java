package tester;

//imports
import java.util.Scanner;
import objects_and_classes.AccountArray;

//class
public class TestAccountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----------Welcome----------");
		System.out.println("\nPlease choose an Option");
		System.out.println(
				"\n1.Add Account\n2.Show Information\n3.Withdraw Money\n4.Transfer Money\n5.Deposit Money\n6.Show Balance\n7.Show All Accounts\n8.Exit");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		AccountArray[] accounts = new AccountArray[5];
		int index = 0;

		do {
			switch (choice) {
			case 1:

				if (index < 5) {
					System.out.println("\nPlease enter information:Name, PhoneNo, Email, Balance respectively");

					accounts[index] = new AccountArray(sc.next(), sc.nextInt(), sc.next(), sc.nextDouble());
					index++;
				} else {
					System.out.println("\nArray is full");
				}
				break;

			case 2:

				System.out.println("\nEnter the account name you want to see information of:");
				String nm = sc.next();
				boolean flag = true;

				for (int i = 0; i < index; i++) {

//					//debug-------------------------------------
//					System.out.println(" "+nm);
//					System.out.println(" "+accounts[i].getName());
//					//-------------------------------------------
//			
					if (accounts[i].getName().equals(nm)) {
						accounts[i].displayInfo();
						flag = true;
					} else {
						flag = false;
					}

				}
				if (flag == false) {
					System.out.println("\nAccount not found");
				}
				break;

			case 3:

				System.out.println("\nEnter the account name you want to withdraw from:");
				nm = sc.next();

				for (int i = 0; i < index; i++) {

					flag = true;
					if (accounts[i].getName().equals(nm)) {
						flag = true;
						System.out.println("\nEnter the amount you want to withdraw:");
						double amount = sc.nextDouble();

						if (accounts[i].getBalance() > amount) {
							accounts[i].withdraw(amount);
							System.out.println("Amount withdrawn: " + amount);
							System.out.println("Balance Left: " + accounts[i].getBalance());

						} else {
							System.out.println("Low Balance");
						}
						break;   //----------------------------------changes

					} else {
						flag = false;
					}
					if (flag == false)
						System.out.println("\nAccount not found");
				}
				break;

			case 4:
				
				AccountArray from = null;
				AccountArray to = null;
				boolean sign =true;
				
				//FROM account check block--------------------------------------
				System.out.println("Enter the Name of the account you want to transfer from:");
				String name = sc.next();
				
				//System.out.println("\n"+(accounts[0].getAccid() == id));
				
				for(int i=0; i<index; i++) {
					if(accounts[i].getName().equals(name)) {
						from = accounts[i];
						sign=true;
						break;
					}
					else {
						sign = false;
					}
				}
				if(sign != true){
					System.out.println("\nAccount not found");
					break;
				}
				
				//TO account check block--------------------------------------
				System.out.println("Enter the Name of the account you want to transfer to:");
				name = sc.next();				
				
				for(int i=0; i<index; i++) {
					if(accounts[i].getName().equals(name)) {
						to = accounts[i];
						sign=true;
						break;
					}
					else {
						sign  = false;
					}
				}
				if(sign != true){
					System.out.println("\nAccount not found");
					break;
				}
				
				// Transfer Block
				System.out.println("\nEnter the amount you want to transfer:");
				double amount = sc.nextDouble();

				if (from.getBalance() > amount) {
					from.transfer(to, amount);
					System.out.println("Amount Transferred: " + amount);
					System.out.println("Balance Left: " + from.getBalance());
				} else {
					System.out.println("Low Balance");
					break;
				}

				break;

			case 5:
				System.out.println("\nEnter the account name you want to deposit to:");
				nm = sc.next();
				flag = true;
				for (int i = 0; i < index; i++) {

					if (accounts[i].getName().equals(nm)) {
						flag = true;
						System.out.println("\nEnter the amount you want to deposit:");
						amount = sc.nextDouble();

						accounts[i].deposit(amount);
						System.out.println("Amount deposited: " + amount);
						System.out.println("Balance Left: " + accounts[i].getBalance());

					} else {
						flag = false;
					}

				}
				if (flag == false)
					System.out.println("\nAccount not found");
				break;

			case 6:
				System.out.println("\nEnter the account name you want to see balance of:");
				nm = sc.next();
				flag = true;
				for (int i = 0; i < index; i++) {

					if (accounts[i].getName().equals(nm)) {
						flag = true;
						System.out.println("\nBalance: " + accounts[i].getBalance());
					} else {
						flag = false;
					}

				}
				if (flag == false)
					System.out.println("\nAccount not found");
				break;

			case 7:

				for (int i = 0; i < index; i++) {
					accounts[i].displayInfo();
				}
				break;
				
			case 8:
				break;
			}

			System.out.println("\nEnter next choice:");
			choice = sc.nextInt();
		} while (choice != 8);
	}

}
