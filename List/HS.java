package CollectionTest;
import java.util.*;

public class HS {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("America");
		hs.add("India");
		hs.add("Japan");
		hs.add("America");
		hs.add("Canada");
		
		System.out.println("Hash Set = "+hs);
		
		Iterator it = hs.iterator();
		System.out.println("Elements using Iterator");
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}

	}

}
