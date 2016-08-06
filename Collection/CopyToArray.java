package HashSet;
import java.util.HashSet;
// Programm to copy Hashset to array
public class CopyToArray {

	public static void main(String[] args) {
		
		HashSet<String> h1 = new HashSet<String>(); 
		h1.add("Hacker Earth");
		h1.add("Hacker Rank");
		h1.add("TechGig");
		System.out.println(h1);
		
		String[] array = new String[(h1.size())];
		h1.toArray(array);
		System.out.println("Copied array");
		for(String arr : array){
			System.out.println(arr);
		}
	}

}
