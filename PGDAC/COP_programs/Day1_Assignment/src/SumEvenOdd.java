import java.util.Scanner;
public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int evensum=0,oddsum=0;
		for(int i=1;i<=a;i++) {
			if(i%2==0)
				evensum=evensum+i;
			else
				oddsum=oddsum+i;
			}
		System.out.println("sum of even numbers:"+evensum);
		System.out.println("sum of odd numbers:"+oddsum);
			
	}

}
