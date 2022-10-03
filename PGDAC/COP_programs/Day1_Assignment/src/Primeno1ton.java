import java.util.Scanner;
public class Primeno1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter a number:");
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     boolean flag=false;
     for(int i=1;i<=3;i++) {
    	 System.out.println(" "+i);
    	 }
        for(int i=4;i<=num;i++) {
        	for(int j=2;j<i;j++) {
        		if(i%j==0) {
        			flag=false;
        		break;}
        		else
        			flag=true;
        	}
        	if(flag==true)
        	System.out.println(" "+i);
        		 }
        }
}
