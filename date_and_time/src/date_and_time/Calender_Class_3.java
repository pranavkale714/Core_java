package date_and_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Calender_Class_3 {

	public static void main(String[] args) {
	//	Calendar c = Calendar.getInstance();
		
		// Calender Type
    //		System.out.println(c.getCalendarType());
		
		//Timezone(Asia/culcatta)
    //	System.out.println(c.getTimeZone());
	    
	//	System.out.println(c.getTimeZone().getID());
					
	
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/Winnipeg"));
        // System.out.println(c.getTimeZone().getID());
        // Define a formatter
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a z");
        sdf.setTimeZone(c.getTimeZone());

        // Print formatted time
        System.out.println("Central Time (Canada): " + sdf.format(c.getTime()));
	
		
	}

}
