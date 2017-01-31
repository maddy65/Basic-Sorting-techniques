package HashSet;
import java.util.*;
public class DeleteAll {

	public static void main(String[] args) {
		
		HashSet<String> H2 = new HashSet<String>();
		H2.add("CSK");
		H2.add("RCB");
		H2.add("MI");
		System.out.println(H2);
		H2.clear();
		System.out.println(H2);
	}

}
