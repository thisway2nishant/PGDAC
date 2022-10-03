import java.util.Scanner;
public class Basicsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter a salary");
      Scanner sc = new Scanner(System.in);
      double salary= sc.nextDouble();
      
      if(salary<150000) {
        System.out.println("tax is 0");
      }
      else if(salary>150000 && salary<=300000)
      {
    	  double tax =.2*salary;
    	  System.out.println("tax is = " +tax);
      }
      else if(salary>300000)
      {
    	  double tax = .3*salary;
    	  System.out.println("tax is = " +tax);
      }
	sc.close();
	}

}
