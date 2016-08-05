package CoreConcept;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class UniqeString {

	public static void main(String[] args) {
	List<String> initialList = Arrays.asList("eBay","PayPal","Google","eBay","PayPal","Google");
	System.out.printf("\n initialList %s%n ", initialList);
	sortList(initialList);
	}
	
	public static void sortList(List<String> myList){
		Set<String> hashsetlist = new HashSet<String>(myList);
		System.out.printf("\n Unique vaues using HashTag is : %s%n ", hashsetlist);
		
		Set<String> treesetlist = new TreeSet<String>(myList);
		System.out.printf("\n Unique vaues using HashTag is : %s%n ", treesetlist);
		
		
		
	}
}
