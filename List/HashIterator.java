package HashSet;
import java.util.*;

public class HashIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("alpha");
		hs.add("beta");
		hs.add("gama");
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
