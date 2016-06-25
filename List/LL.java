package PgmSimplified;
import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		LinkedList<String> fruit = new LinkedList<String>();
				
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Graps");
		fruit.add("Banana");
		System.out.println(fruit);
		System.out.println("Size of linked list"+fruit.size());
		System.out.println("Is Linked list Empty "+fruit.isEmpty());
		System.out.println("Search Banana"+fruit.contains("Banana"));
	}

}
