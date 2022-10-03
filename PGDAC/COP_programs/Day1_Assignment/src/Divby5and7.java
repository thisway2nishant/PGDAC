import java.util.Scanner;
public class Divby5and7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 
 int x;
  System.out.println("enter a number");
   x=sc.nextInt();
   
   if(x%5==0 && x%7==0) {
	   System.out.println("number is divisible by 5 and 7");
   }
   else
		   System.out.println("number is not divisible by 5 and 7");
	}
	
}
