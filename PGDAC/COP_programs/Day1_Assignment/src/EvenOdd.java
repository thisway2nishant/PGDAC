import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter a number:");
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     
     if(x%2==0)
    	 System.out.println("number is even");
     else
    	 System.out.println("number is odd");
    	 
	}

}
