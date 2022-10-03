import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter a number");
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int fact =1;
     for(int i=x;i>0;i--) {
    	 fact = fact*i;
     }
     
     System.out.println("Factorial is " + fact);
	}

}
