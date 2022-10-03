package objects_and_classes;

public class AccountArray {

	private int accno,phoneno;
	private String name,email;
	private double balance;
	
	//static
	private static int index = 0;
	private static int accid = 1000;
	
	//constructor
	public AccountArray()
	{
		name = "Nishant";
		phoneno = 7860;
		email = "mail@mail.com";
		accno = accid;
		accid++;
		index++;
	}
	
	public AccountArray(String name,int phoneno, String email, double balance) {
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
		this.accno = accid;
		this.balance = balance;
		accid++;
		index++;
	}
	
	//methods
	
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}
	
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	public void transfer(AccountArray account, double amount) {
		this.balance = this.balance - amount;
		account.balance += amount;
	}
	
	public void displayInfo() {
		System.out.println("Name: "+this.name);
		System.out.println("AccId: "+this.accno);
		System.out.println("Balance: "+this.balance);
		System.out.println("PhoneNo: "+this.phoneno);
		System.out.println("Email Id: "+this.email);
	}
	
	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAccid() {
		return accid;
	}

	public double getBalance() {
		return balance;
	}
	 
}
