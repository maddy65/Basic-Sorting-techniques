package HashSet;
import java.io.*;
import java.util.*;

public class ArraysDemo {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[5];
		System.out.println("Enter an integer");
			for(int i=0; i<5; i++){
				arr[i] = Integer.parseInt(br.readLine());
			}
		System.out.println("Contents of the array ");
		display(arr);
		Arrays.sort(arr);
		System.out.println("The sorted array: ");
		display(arr);
		System.out.println("Enter element to be searched: ");
		int element = Integer.parseInt(br.readLine());
		int index = Arrays.binarySearch(arr, element);
		if(index<0) System.out.println("Element not found");
		else System.out.println("Element found location : "+(index+1));
	}

	static void display(int[] arr) {
		for(int i:arr){
			System.out.println(i);
		}
		
	}

}
