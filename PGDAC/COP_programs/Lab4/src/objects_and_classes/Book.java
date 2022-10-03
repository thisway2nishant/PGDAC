package objects_and_classes;

public class Book {

	private String bname, author;
	private int id;
	private double price;
	
	private static int count = 1;
	
	// constructor
	public Book() {

		this.bname = bname;
		this.author = author;
		this.id = count;
		this.price = price;
		count++;
	}

	public Book(String bname, String author, double price) {
		
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.id = count;
		count++;
	}

	// method
	public void display() {
		System.out.println(bname + "\n" + author + "\n" + id + "\n" + price);
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
