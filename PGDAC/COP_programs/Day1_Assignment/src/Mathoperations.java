import java.util.Scanner;

public class Mathoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter two numbers;");
		Scanner sc = new Scanner(System.in);
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();

		System.out.println("enter operations:(1.+ 2.- 3.* 4./)");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.println("addition is " + (n1 + n2));
			break;
		case 2:
			System.out.println("subtraction is " + (n1 - n2));
			break;
		case 3:
			System.out.println("multiplication is " + (n1 * n2));
			break;
		case 4:
			System.out.println("division is " + (n1 / n2));
			break;
		}

	}

}
