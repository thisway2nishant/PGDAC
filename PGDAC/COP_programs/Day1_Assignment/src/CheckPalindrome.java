import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number you want to check:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int reverse =0;
		
		while(n>0)
		{
			int lastnum=n%10;
			reverse=reverse*10+lastnum;
			n=n/10;		
		}
		
		if(temp == reverse) {
			System.out.println("Number is palindrome");
		}
		else
		System.out.println("Number is not palindrome");
	}

}
