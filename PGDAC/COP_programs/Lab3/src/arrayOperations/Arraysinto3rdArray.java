package arrayOperations;
import java.util.Scanner;
public class Arraysinto3rdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size of first array");
		Scanner sc=new Scanner(System.in);
		
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		
		System.out.println("enter size of second array");
		
		int size2=sc.nextInt();
		int[] arr2=new int[size2];
		int size3 = size1 + size2;
		int[] arr3=new int[(size3)];
		
		
		System.out.println("enter element of first array:");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		
		System.out.println("enter element of second array:");
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr1.length; i++) {
			
			arr3[i] = arr1[i];
		}
		
		int count = size1;
		for(int i=0; i<arr2.length; i++) {
			if(count<arr3.length)
				arr3[count] = arr2[i];
			else 
				break;
			
			count++;
			
		}
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(" "+arr3[i]);
		}
	}
	
}	
	     
	      


