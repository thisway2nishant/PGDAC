package tester;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.org.Emp;
import com.app.org.Mgr;
import com.app.org.Worker;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Emp> employees = new ArrayList<>();

		System.out.println("Please select your Choice");
		System.out.println("1.Hire Manager\n2.Hire Worker\n3.Update Salary\n10.exit");
		int choice = sc.nextInt();

		while (choice != 10) {
			switch (choice) {
			case 1:
				System.out.println("Please enter firstname, lastname, deptId, basic Salary and performance bonus");
				employees.add(new Mgr(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble()));
				break;

			case 2:
				System.out.println(
						"Please enter firstname, lastname, deptId, basic Salary, hours worked and hourly rate");
				employees.add(new Worker(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble(),sc.nextDouble()));
				break;
				
			case 4:
				System.out.println("Enter employee id and new salary");
				int empId = sc.nextInt();
				double salary = sc.nextDouble();
				boolean flag = false;
				for(Emp i : employees) {
					if(i.getEmpid() == empId) {
						i.setBasicSal(salary);
						flag = true;
					}
					else
						flag = false;	
				}//end of for-each
				
				if(!flag)
					System.out.println("Employee not found. Enter valid EmployeeId");
				break;

			case 10:
				System.out.println("Exited");
				break;

			default:
				break;
			}//end of switch
			System.out.println("Enter next choice or enter 10 to exit.");
			choice = sc.nextInt();
		}//end of while
		
		for(Emp i : employees) {
			System.out.println(i.toString()+" "+i.calcSal());
		}
	}
	
}
