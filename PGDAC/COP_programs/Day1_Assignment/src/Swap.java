import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers you want to swap:");
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3;
		
		System.out.println("before swap a: "+n1+" b: "+n2);
		
		n3 = n1;
		n1=n2;
		n2 = n3;
		System.out.println("before swap a: "+n1+" b: "+n2);
	}

}
