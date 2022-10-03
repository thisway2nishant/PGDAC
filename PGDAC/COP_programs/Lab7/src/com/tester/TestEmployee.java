package com.tester;

import com.code.Employee;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter employee name and basic salary");
		
		Employee emp = new Employee(sc.next(), sc.nextDouble());
		
		emp.display();
	}

}
