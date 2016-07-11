package Collections;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList <String> Arl = new ArrayList<String>();
		Arl.add("India");
		Arl.add("Pakistan");
		Arl.add("Japan");
		Arl.add("China");
		Arl.add("India");
		System.out.println("ArrayList: "+Arl);
		
		System.out.println(Arl.size());
		Arl.remove("India");
		Iterator it = Arl.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
 
	}

}
