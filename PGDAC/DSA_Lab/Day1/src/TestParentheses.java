import java.util.Scanner;

public class TestParentheses {

	public static void main(String[] args) {
		boolean flag = true;
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the size of stack according to parentheses:");
			int size = sc.nextInt();
			
			Stack<String> opers = new Stack<String>(size);
			
			System.out.println("Start entering the parentheses");
			String ch = sc.next();
			
			while(!(ch.equals("1"))) {
				if(ch.matches("^[({\\[<]"))
					opers.push(ch);
				else if(ch.matches("^[)}\\]>]")) {
					String tmp = opers.pop();
					switch(tmp) {
					case "(":
						if(ch.equals(")"))
							flag = true;
						else
							flag = false;
						break;
						
					case "{":
						if(ch.equals("}"))
							flag = true;
						else
							flag = false;
						break;
						
					case "[":
						if(ch.equals("]"))
							flag = true;
						else
							flag = false;
						break;
						
					case "<":
						if(ch.equals(">"))
							flag = true;
						else
							flag = false;
						break;
					
					}
				}
				if(flag)
				{
				System.out.println("Enter next or 1 to exit");
				ch = sc.next();
				}
				else {
					System.out.println("Parentheses mismatch.");
					break;
					}
				 	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag)
			System.out.println("Perfect");
		else
			System.out.println("Not bad, Not bad");
	}

}
