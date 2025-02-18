package date_and_time;
import java.time.*;

public class System_time_in_milliseconds_1 {

	public static void main(String[] args) {
		
		// Days form 1 jan 1970
		System.out.println(System.currentTimeMillis()/1000/3600/24 + " Days");
		
		// Weeks form 1 jan 1970 
		System.out.println(System.currentTimeMillis()/1000/3600/24/7 + " weeks");
		
		// Months form 1 jan 1970
		System.out.println(System.currentTimeMillis()/1000/3600/24/30 +" months");
		
		// Year from 1 jan 1970
		System.out.println(System.currentTimeMillis()/1000/3600/24/365 + " Year");
	
	}

}
