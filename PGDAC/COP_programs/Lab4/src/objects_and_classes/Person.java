package objects_and_classes;

public class Person {

	//data members
	private String name, city;
	private int age;
	
	//constructors
	public Person() {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public Person(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}
	
	//method
	
	public void display() {
		System.out.println("Name: "+name+"\nCity: "+city+"\nAge: "+age);
	}
	
	
	public void getName() {
		System.out.println(" "+name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getCity() {
		System.out.println(" "+city);
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void getAge() {
		System.out.println(" "+age);
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
