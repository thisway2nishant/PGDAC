import java.util.Scanner;
import java.lang.Math;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter a number:");
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
      int tempnum=num;
      double cubesum=0;
     while(num>0) {
    	 
    	 int lastnum=num%10;
    	 cubesum=cubesum+Math.pow(lastnum, 3);
    	 num=num/10;
     }
     if(cubesum==tempnum) {
    	 System.out.println("number is armstrong");
     }
     else
    	 System.out.println("number is not armstrong");
     
	}

}
