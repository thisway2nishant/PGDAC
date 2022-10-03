package others;

public class MethodOverloading {

	//data members
	int total, num1, num2;
	
	//constructor
	public MethodOverloading() {
		System.out.println("-----default constructor-----");
		num1 = 10;
		num2 = 10;
		
	}

	public MethodOverloading(int num1, int num2) {
		System.out.println("-----parameterized constructor-----");
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	
	//Methods
	
	public void add() {
		total = num1+num2;
		System.out.println("This is add1.\nThe total is "+total);
	}
	
	public void add(int num1, int num2) {
		total = num1+num2;
		System.out.println("This is method overloading.\n Total = "+total);
	}
	
}
