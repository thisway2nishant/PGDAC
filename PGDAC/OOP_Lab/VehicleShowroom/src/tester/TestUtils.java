package tester;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import com.app.core.Vehicle;
import static utils.ShowroomUtils.populateShowroom;
public class TestUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<? super Vehicle> vehicles = new ArrayList<Vehicle>();
		
		try {
			vehicles = populateShowroom();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		vehicles.forEach(i->System.out.println(i));
	}

}
