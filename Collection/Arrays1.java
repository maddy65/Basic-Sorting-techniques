package HashSet;
import java.io.*;
import java.util.*;

public class Arrays1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements? :");
		int size = Integer.parseInt(br.readLine());
		Integer arr[] = new Integer[size];
		System.out.println("Enter int: ");
		for(int i=0; i<size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr,new Ascend());
		System.out.println("Array is Ascending order: ");
		display(arr);
		Arrays.sort(arr, new Descend());
		System.out.println("Array is Ascending order: ");
		display(arr);
	}

static void display(Integer[] arr) {
		for(Integer i: arr){
			System.out.println(i);
		}
		
	}
}

class Ascend implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2){
		return i1.compareTo(i2);
	}
}
class Descend implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2){
		return i2.compareTo(i1);
	}
}
