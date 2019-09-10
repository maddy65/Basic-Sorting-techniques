package com.geeks.ds.array.orderStatics;

public class TwoLargest {

	public static void twolargestElement(int array[]) {
		int first, second;
		first = second = Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			if(array[i] > first) {
				second = first;
				first = array[i];
			}
			else if(array [i] > second) {
				second = array[i];
			}
		}
		
		for(int j=0; j<array.length; j++) {
			if(array[j] < second) {
				System.out.print(array[j]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int [] array = {32,23,45,65,33,43};
		twolargestElement(array);

	}

}
