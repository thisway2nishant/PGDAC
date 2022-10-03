import java.util.Scanner;
public class MenudrivenShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1. Small($10)  2. Medium($15)  3. Large($30)  4.Exit");
	System.out.println("enter your choice:");
    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    int amount=0;
    
    do {
    	switch(choice) {
    	case 1:amount=amount+10;
    	break;
    	case 2:amount=amount+15;
    	break;
    	case 3:amount=amount+30;
    	break;
    	case 4:break;
    	}
    	System.out.println("enter next choice:");
        choice=sc.nextInt();
    }while(choice!=4);
    System.out.println("total amount is:"+amount);
  
	}

}
