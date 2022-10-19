package testPoints;

import java.util.Scanner;
import com.cdac.geometry.Point2D;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter how many points you want to add.");
		Scanner sc = new Scanner(System.in);
		Point2D[] pointsArray = new Point2D[sc.nextInt()];
		
		
		for(int i=0;i<pointsArray.length;i++) {
			System.out.println("Please enter the coordinates");
			pointsArray[i] = new Point2D(sc.nextInt(), sc.nextInt());
		}
		
		System.out.println("The Points you enterd are as follows:");
		for(Point2D p: pointsArray) {
			System.out.println(p.toString());
		}
		
		System.out.println("Enter two indexes you want to check equality on:");
		int index1 = sc.nextInt()-1;
		int index2 = sc.nextInt()-1;
		
		//Comparing using isEqual method of Point2D class taking indices directly from user 
		if(pointsArray[index1].isEqual(pointsArray[index2])) {
			System.out.println("Both Coordinates are equal.");
		}
		else {
			double xDiff = pointsArray[index1].getX() - pointsArray[index2].getX();
			double yDiff = pointsArray[index1].getY() - pointsArray[index2].getY();
			
			System.out.println("The difference between the coordinates is "+ xDiff+","+ yDiff);
		}
		
		sc.close();
	}
	
}
