package Collections;
import java.util.*;
import java.io.*;

public class HashTableDemo {

	public static void main(String[] args) throws IOException {
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("Ajay", 111);
		ht.put("Tray", 222);
		ht.put("Prasad", 333);
		ht.put("Dhoni", 444);
		
		System.out.println("The player name");
		Enumeration e = ht.keys();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter player name");
		String name = br.readLine();
		name = name.trim();
		Integer score = ht.get(name);
		if(score !=null){
			int sc = score.intValue();
			System.out.println(name+" scored "+sc);
		}else{
			System.out.println("Player not found");
		}
	}

}
