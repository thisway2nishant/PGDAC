import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number you want to check:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean flag = true;
		for(int i=2; i<n/2; i++) {
			
			if(n%i==0) {
				flag = false;
			}
			else{
				flag = true;
			}
		}
		
		if(flag)
			System.out.println("Number is prime");
	}

}
