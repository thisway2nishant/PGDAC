package tester;
import objects_and_classes.ComplexNumber;
public class TestComplexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber n1=new ComplexNumber();
		ComplexNumber n2=new ComplexNumber(10.50,12.12);
		
		System.out.println("----------Default constructor----");
		n1.display();
		
		System.out.println("\n---------Parameterized constructor---------");
		n2.display();
		
		n1.setReal(5.12);
		n1.setImaginary(10.20);
		
		System.out.println("\nafter setting n1 using setters");
		n1.display();
		
	}

}
