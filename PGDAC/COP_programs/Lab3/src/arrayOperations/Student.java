package arrayOperations;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter details: Name and RollNo.");
		Scanner sc  = new Scanner(System.in);
		
		String name = sc.next();
		int rollno = sc.nextInt();
		double[] marks = new double[5];
		double total = 0; double per = 0;
		String grade = null;
		System.out.println("Enter marks of 5 subjects.");
		
		for(int i=0; i<5; i++) {
			marks[i] = sc.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			total+= marks[i];		
		}
		
		per = (total/500)*100;
		
		if(per>75) {
			grade = "A";
		}
		else if(per<75 && per>60) {
			grade = "B";
		}
		else
			grade ="C";
		
		System.out.println("Total: "+total+"\nPercentage: "+per+"\nGrade: "+grade);
	}

}
