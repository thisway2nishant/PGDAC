import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter a character");
      		Scanner sc=new Scanner(System.in);
      		char ch = sc.next().charAt(0);
      		
      		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      			System.out.println("Character is a vowel");
      		}
      		
      		else {
      			System.out.println("Character is a consonant");
      		}
	}

}
