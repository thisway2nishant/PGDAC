package com.tester;

import com.code.Date;
import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call using default constructor
		Date dt = new Date();
		
		//call using parameterised constructor
		System.out.println("\n Please enter Day, Month and Year");
		Scanner sc = new Scanner(System.in);
		
		Date dt2 = new Date(15, 06, 2022);
		
		dt.display();
		dt2.display();
	}

}
