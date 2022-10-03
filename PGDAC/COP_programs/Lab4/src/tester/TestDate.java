package tester;
import objects_and_classes.Date;
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		Date dt2 = new Date(12, 3, 2022);
		
		System.out.println("----------Default constructor----");
		dt.display();
		
		System.out.println("\n---------Parameterized constructor---------");
		dt2.display();
		
		dt.setDd(12);
		dt.setMm(4);
		dt.setYy(2023);
		
		System.out.println("\nAfter setting date dt using setters");
		dt.display();
	}

}
