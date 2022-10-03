import java.util.Scanner;
import java.lang.Math;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the base and exponent:");
		Scanner sc = new Scanner(System.in);
		
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		
		System.out.println("The result is "+ Math.pow(base, exponent));
	}

}
