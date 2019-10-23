package com.geeks.ds.array.rangeQuery;

public class MOAlgorithm {

	public static void main(String[] args) {
		int [] array = {1, 1, 2, 1, 3, 4, 5, 2, 8}; 
		int value1 = 1;
		int value2 = 3;
		findRangeSum(array, value1, value2);
	}

	private static void findRangeSum(int[] array, int value1, int value2) {
		int sum = 0;
		for(int i=value1; i<=value2; i++) {
			sum += array[i];
		}
		System.out.println("Total sum of range "+value1+" and  "+value2+" is :"+sum);
		
	}

}
