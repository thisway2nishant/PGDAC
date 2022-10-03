package objects_and_classes;

public class Date {
	//DATA members
	private int dd,mm,yy;
	
	//constructors
	public Date() {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	
	//methods
	public void display() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}

	public void getDd() {
		System.out.println(dd);
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public void getMm() {
		System.out.println(mm);
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public void getYy() {
		System.out.println(yy);
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	
}
