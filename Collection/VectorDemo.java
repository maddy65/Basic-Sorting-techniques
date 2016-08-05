package CoreConcept;

import java.util.ListIterator;
import java.util.Vector;
import java.io.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> V = new Vector<Integer>();
		int x[] = {20,25,63,87,47,60};
		for(int i=0; i<x.length; i++){
			V.add(x[i]);
		}
		System.out.println("Vector Elements : ");
		for(int i=0; i<V.size(); i++){
			System.out.println(V.get(i));
		}
		System.out.println("Element using ListIterator");
		ListIterator li = V.listIterator();
		System.out.println("\n In forward direction: ");
		while(li.hasNext()){
			System.out.println(li.next()+"\t");
		}
		System.out.println("\n In backward direction: ");
		while(li.hasPrevious()){
			System.out.println(li.previous()+"\t");
		}
	}

}
