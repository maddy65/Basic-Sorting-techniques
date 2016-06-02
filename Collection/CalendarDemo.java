package HashSet;
import java.util.*;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		System.out.println("Current date :");
		int dd = cl.get(Calendar.DATE);
		int mm = cl.get(Calendar.MONTH);
		++mm;
		int yy = cl.get(Calendar.YEAR);
		System.out.println(dd+ "-"+mm+"-"+yy);
		
		System.out.println("Current time :");
		int h = cl.get(Calendar.HOUR); 
		int m = cl.get(Calendar.MINUTE);
		int s = cl.get(Calendar.SECOND);
		System.out.println(h+" : "+m+" : "+s);
		

	}

}
