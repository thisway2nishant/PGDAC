package arrayOperations;
import java.util.Scanner;
public class CharStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size of array");
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int[] arr=new int[size];
		String str = "";
		
		System.out.println("enter the string");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		
		for(int i=0;i<size;i++)
		{
			char ch = (char)arr[i];
			str = str+ch; 
		}
		
		System.out.println(" "+str);
	}

}
