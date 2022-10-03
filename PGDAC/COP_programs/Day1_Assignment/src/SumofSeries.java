import java.util.Scanner;

public class SumofSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number upto which you want to add:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum=0;
		
		for(int i=2; i<=n; i++) {
			sum+=i;
		}
		
		System.out.println("The sum upto "+n+" is "+sum);
	}

}
