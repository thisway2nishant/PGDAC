package others;
import others.MethodOverloading;
public class TestMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading method = new MethodOverloading();
		MethodOverloading method2 = new MethodOverloading(10, 10);
		
		
		method.add();
		
		method.add(10, 15);
	}

}
