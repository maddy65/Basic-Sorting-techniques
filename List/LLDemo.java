package Collections;
import java.util.*;
import java.io.*;

public class LLDemo {

	public static void main(String[] args) throws IOException {
		LinkedList<String> ll = new LinkedList();
		ll.add("Japan");
		ll.add("SriLanka");
		ll.add("India");
		ll.add("Japan");
		System.out.println("List : "+ll);
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int position, choice=0;
		String element;
		while(choice<4){
			System.out.println("\n LinkedList Operation");
			System.out.println("1. Add Element");
			System.out.println("2. Remove Element");
			System.out.println("3. Change an Element");
			System.out.println("4. Exit");
			System.out.println("your Choice");
			choice = Integer.parseInt(br.readLine());
			switch(choice){
				case 1:System.out.println("Enter element: ");
					   element = br.readLine();	
					   System.out.println("At what position");
					   position = Integer.parseInt(br.readLine());
					   ll.add(position-1, element);
					   break;
				case 2:System.out.println("Enter position: ");
					   position = Integer.parseInt(br.readLine());
					   ll.remove(position);
					   break;
				case 3:System.out.println("Enter position");
					   position = Integer.parseInt(br.readLine());
					   System.out.println("Enter new element");
					   element = br.readLine();
					   ll.set(position, element);
					   break;
				default: return;
			}
			System.out.println("List =");
			Iterator itr = ll.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}

	}

}
