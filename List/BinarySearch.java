package GeeksSS;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int low, high, key, mid, number;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int array[] = new int[number];
		for(int i =0; i<number; i++){
			array[i] = sc.nextInt();
		}
		System.out.println("Enter key element to be searched");
		key = sc.nextInt();
		low =0;
		high =number-1;
		mid = low+(high-low)/2;
		while(low<=high){
			
			
			if(key == array[mid]){
				System.out.println("Element found at " + (mid+1)+ "position");
				break;
			}else if(key < array[mid]){
				high = mid-1;
				mid = (low+high)/2;
				System.out.println("Element found at "+(mid-1)+"position");
				break;
			}else if(key > array[mid]){
				high = mid+1;
				mid = (low+high)/2;
				System.out.println("Element found at "+(mid+1)+"position");
				break;
			}
		}
	}

}
