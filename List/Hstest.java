package CollectionTest;
import java.util.*;

public class Hstest {

	public static void main(String[] args) {
		
		HashSet hstest = new HashSet(2);
		
		hstest.add("I am first");
		hstest.add("I am second");
		hstest.add("I am third");
		System.out.println(hstest);
		int size = hstest.size();
		System.out.println(size);
		
	}

}
