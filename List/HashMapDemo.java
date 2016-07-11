package Collections;
import java.io.*;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args)throws IOException {
		
		HashMap<String,Long> hm = new HashMap <String,Long>();
		String name,str;
		Long phno;
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.println("1. Enter phone entries");
			System.out.println("2. Lookup in the book");
			System.out.println("3. Display name in Book");
			System.out.println("4. Exit");
		
			System.out.println("Your choice");
			int n = Integer.parseInt(Br.readLine());
			switch(n){
			case 1:System.out.println("Enter name: ");
			 	   name = Br.readLine();
			 	   System.out.println("Enter phone: ");
			 	   str = Br.readLine();
			 	   phno = new Long(str);
			 	   hm.put(name, phno);
				   break;
			case 2: System.out.println("Enter name : ");
					name = Br.readLine();
					name = name.trim();
					phno = hm.get(name);
					System.out.println("Phone Number is : "+phno);
					break;
			case 3: Set<String> set = new HashSet<String>();
					set = hm.keySet();
					System.out.println(set);
					break;
			case 4: return;
			}
		}
	}

}
