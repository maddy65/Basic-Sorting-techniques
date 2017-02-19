package HashSet;
import java.util.*;

public class MyBasicHasSetOperation {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		System.out.println("Is HashSet empty : "+hs.isEmpty());
		hs.add("Maddy");
		hs.add("Abahy");
		hs.add("Vinay");
		hs.add("Ranjay");
		
		System.out.println("Size of HashSet : "+hs.size());
		System.out.println(hs);
		hs.remove("Vinay");
		System.out.println("Is Hashset contain Ranjay ?");
		if(hs.contains("Ranjay")){
			System.out.println("Yes Ranjay is there");
		}else{
			System.out.println("No Ranjay is not there");
		}
	}

}
