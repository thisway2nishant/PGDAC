package objects_and_classes;

public class ComplexNumber {

	private double real;
	private double imaginary;
	
	//constructor
     
	public ComplexNumber() {
		
		this.real=real;
		this.imaginary=imaginary;
		
	}

	public ComplexNumber(double real, double imaginary) {
		
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	
	public void display() {
		System.out.println(real+" "+imaginary);
	}
	
}

