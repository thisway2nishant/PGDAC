package com.tester;

import java.util.Scanner;
import com.code.Date;
import com.code.BasicEmp;

public class TestBasicEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nPlease enter employee Name");
		String name = sc.next();
		
		System.out.println("\nPlease enter employee BirthDate of employee in  day, month and year separately");
		Date dob = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		BasicEmp employee = new BasicEmp(name, dob);
		
		
		employee.display();
	}

}
