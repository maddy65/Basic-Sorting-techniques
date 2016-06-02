package Collections;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		 Vector<Integer> V = new Vector<Integer>();
		 int array[] = {3,4,5,6,7,8,9};
		 for(int i=0;i<array.length;i++){
			 V.add(array[i]);
		 }
		 System.out.println("Vector Element");
		 for(int j=0;j<V.size();j++){
			 System.out.println(V.get(j));
		 }
		 ListIterator Itr = V.listIterator();
		 System.out.println("\n Forward Direction");
		 while(Itr.hasNext())
			 System.out.println(Itr.next()+"\t");
		 
		 System.out.println("\n Backward Direction");
		 while(Itr.hasPrevious())
			 System.out.println(Itr.previous()+"\t");
		 
	}

}
