package tester;
import objects_and_classes.Student;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		
		System.out.println("Accepting info");
		s1.acceptInfo();
		System.out.println("---------------------------");
		
		System.out.println("Displaying info");
		s1.display();
		System.out.println("---------------------------");
		
		System.out.println("Displaying stats");
		s1.displayStats();
		System.out.println("---------------------------");
	}

}
