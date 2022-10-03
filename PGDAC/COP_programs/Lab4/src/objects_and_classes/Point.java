package objects_and_classes;

public class Point {
	
	private double x,y;
	
	//constructor
	public Point() {
		this.x=x;
		this.y=y;
	}

	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	 public void display() {
		 System.out.println("("+x+","+y+")");
	 }

}
