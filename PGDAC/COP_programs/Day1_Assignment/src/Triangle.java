import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter three angles");
     Scanner sc=new Scanner(System.in);
     float x= sc.nextFloat(),y= sc.nextFloat(), z= sc.nextFloat();
    	       
     float sum = x+y+z;
     
     if(sum == 180) {
    	 System.out.println("Triangle is valid");
     }
     
     else {
    	 System.out.println("Triangle is invalid");
     }
	}

}
