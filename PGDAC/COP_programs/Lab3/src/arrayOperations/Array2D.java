package arrayOperations;
import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter rows and column:");
		Scanner sc=new Scanner(System.in);
		
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		int[][] arr = new int[rows][columns];
		
		System.out.println("enter elements:");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr[i][j]=sc.nextInt();
			}
				
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");	
		}
	}

}
