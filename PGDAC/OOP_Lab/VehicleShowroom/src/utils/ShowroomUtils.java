package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import com.app.core.Vehicle;
import static com.app.core.Vehicle.sdf;

public class ShowroomUtils {
	public static List<? super Vehicle> populateShowroom() throws ParseException{
		List<Vehicle> al = new ArrayList<Vehicle>();
		
		al.add(new Vehicle("FM1234", "Thar", "Mahindra", sdf.parse("12-02-2022"), "blue"));
		al.add(new Vehicle("GM1334", "Scorpio", "Mahindra", sdf.parse("28-03-2020"), "black"));
		al.add(new Vehicle("CM1234", "Bolero", "Mahindra", sdf.parse("15-04-2021"), "White"));
		al.add(new Vehicle("DM1234", "Endeavour", "Ford", sdf.parse("16-02-2019"), "Black"));
		al.add(new Vehicle("AM1234", "Thar", "Mahindra", sdf.parse("12-02-2022"), "Black"));
		
		return al;
	}
}
