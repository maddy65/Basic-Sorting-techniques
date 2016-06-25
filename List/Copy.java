package PgmSimplified;
import java.util.LinkedList;

public class Copy {

	public static void main(String[] args) {
		LinkedList<String> L1 = new LinkedList<String>();
		L1.add("Maddy");
		L1.add("BalaKrishna");
		L1.add("Deepak");
		L1.add("Uttam");
		//LinkedList<String> L2 = (LinkedList<String>)L1.clone();
		Object L2 = new LinkedList<String>();
		L2 = L1.clone();
		System.out.println("Actual List"+L1);
		System.out.println("Copied List"+L2);
	}

}
