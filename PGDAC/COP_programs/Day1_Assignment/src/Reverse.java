import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int revnum=0;
		while(num>0)
		{
			int lastnum=num%10;
			revnum=revnum*10+lastnum;
			num=num/10;		
		}
		System.out.println("reverse of number is:"+revnum);
			
	}

}
