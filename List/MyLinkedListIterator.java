package PgmSimplified;
import java.util.LinkedList;
import java.util.Iterator;

public class MyLinkedListIterator {

	public static void main(String[] args) {
		LinkedList<String> number = new LinkedList<String>();
		number.add("first");
		number.add("second");
		number.add("third");
		number.add("fourth");
		Iterator<String> itr = number.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
