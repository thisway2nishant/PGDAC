package tester;
import objects_and_classes.Point;
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1=new Point();
		Point p2=new Point(20.11,30.22);
		
		System.out.println("----------Default constructor----");
		p1.display();
		
		System.out.println("\n---------Parameterized constructor---------");
		p2.display();
		
		p1.setX(25.30);
		p1.setY(23.22);
		
		System.out.println("\nafter setting p1 using setters");
		p1.display();
		
	}

}
