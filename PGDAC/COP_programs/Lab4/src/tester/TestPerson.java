package tester;
import objects_and_classes.Person;
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------default constructor---------");
		Person p = new Person();
		p.display();
		
		System.out.println("-------parameterized constructor---------");
		Person p2 = new Person("Sufiyan", "Pune", 22);
		p2.display();
		
		
		System.out.println("\n\nafter setting data in p using setters");
		p.setName("Nishant");
		p.setCity("Moradabad");
		p.setAge(22);
		
		p.display();
		
		System.out.println("\n\ngetters for p2");
		p2.getName();
		p2.getCity();
		p2.getAge();
		
		
	}

}
