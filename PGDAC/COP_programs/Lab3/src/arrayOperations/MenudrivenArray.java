package arrayOperations;
import java.util.Scanner;
public class MenudrivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size of array");
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		
		System.out.println(" 1:Read Array\n 2:Print Array\n 3:Search element in array\n 4:Reverse Array\n 5:Even number from array\n 6:sum of array element\n 7:Exit");
		
		System.out.println("-------------\n Enter your choice");
		int choice=sc.nextInt();
		do {
		switch(choice) {
		case 1:
			System.out.println("enter the elements");
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			break;
			
		case 2: 
			System.out.println("the array is:");
			for(int i=0;i<size;i++)
			{
				System.out.println(""+arr[i]);
			}
			break;
			
		case 3: 
			System.out.println("enter the element to search:");
			int search=sc.nextInt();
			
			for(int i=0;i<size;i++)
			{
				if(arr[i]==search)
					System.out.println(""+arr[i]);
				else
					continue;
			}
			break;
			
			
		case 4: 
			for(int i=size-1;i>=0;i--)
			{
					System.out.println(""+arr[i]);
			}
			break;
			
		case 5:
			System.out.println("The even numbers are: ");
			for(int i=0;i<size;i++)
			{
				if(arr[i]%2==0)
					System.out.println(" "+arr[i]);
				else
					continue;
			}
			break;
			
		case 6:
			int sum=0;
			for(int i=0;i<size;i++)
			{
			 sum=sum+arr[i];
						
			}
			 System.out.println("Sum of array elements is:"+sum);
			break;
			
		case 7:
			break;
			
		}
		
		System.out.println("enter next choice");
		choice=sc.nextInt();
	}while(choice!=7);
	}

}
