package HashSet;
import java.util.*;

public class Copy {

	public static void main(String[] args) {
		
		HashSet<String> h1 = new HashSet<String>();
		h1.add("BatMan");
		h1.add("SuperMan");
		h1.add("XMan");
		System.out.println(h1);
		HashSet<String> h2 = new HashSet<String>();
		h2.add("Captain America");
		h2.add("Cat Women");
		h2.add("XMan"); // Not taking this. Considering as a duplicate
		h1.addAll(h2);
		System.out.println(h1);
	}

}
