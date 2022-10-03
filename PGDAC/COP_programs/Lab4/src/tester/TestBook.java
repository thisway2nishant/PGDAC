package tester;
import objects_and_classes.Book;
//import objects_and_classes.Date;
public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Book book1 = new Book();
		Book book2 = new Book("Let us C", "Yashwant Kanetkar", 145.20);
		
		System.out.println("----------Default constructor----");
		book1.display();
		
		System.out.println("\n---------Parameterized constructor---------");
		book2.display();
		
		book1.setAuthor("Chetan Bhagat");
		book1.setBname("A million Stars");
		book1.setPrice(250.55);
		
		System.out.println("\nAfter Setting Book1 data using setters");
		book1.display();
			
		//System.out.println(book2.getBname());
	}

}
