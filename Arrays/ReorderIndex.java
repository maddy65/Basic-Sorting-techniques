package com.geeks.ds.array.rangeQuery;

import java.util.Arrays;

public class ReorderIndex {
	
	static int arr[] = new int[] {50,40,70,60,90};
	static int index[] = new int[] {3,0,1,4,2};

	public static void main(String[] args) {
		reorder();
		System.out.println("Reordered array is: "); 
		System.out.println(Arrays.toString(arr)); 
		System.out.println("Modified Index array is:"); 
		System.out.println(Arrays.toString(index)); 
		
	}

	private static void reorder() {
		int temp[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			temp[index[i]] = arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = temp[i];
			index[i] = i;
		}
	}
}
