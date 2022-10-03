package objects_and_classes;

public class BankAccount {

	private int accid, balance, phoneno;
	private String name;
	private static int count = 1000;

	// constructor
	public BankAccount() {

		this.balance = balance;
		this.name = name;
		this.phoneno = phoneno;
		this.accid = count;
		count++;
	}

	public BankAccount(String name, int balance, int phoneno) {

		this.balance = balance;
		this.phoneno = phoneno;
		this.name = name;
		this.accid = count;
		count++;
	}

	public void withdraw(int money) {
		this.balance = this.balance - money;
		System.out.println("Money withdrawn: " + money + "\nBalance: " + balance);
	}

	public void deposit(int money) {
		this.balance = this.balance + money;
		System.out.println("Money deposited: " + money + "\nBalance: " + balance);
	}

	public void showBalance() {
		System.out.println("Your balance is " + this.balance);
	}
	
	public void transferMoney(int money, BankAccount account) {
		this.balance = this.balance-money;
		account.balance = account.balance+money;
		
		System.out.println("Amount transferred to "+account.name+": "+money+"\nBalance left: "+balance);
	}
	
	public void showInfo() {
		
		System.out.println("\nName: "+this.name);
		System.out.println("\nAccount no.: "+this.accid);
		System.out.println("\nBalance: "+this.balance);
		System.out.println("\nPhone No.: "+this.phoneno);
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
