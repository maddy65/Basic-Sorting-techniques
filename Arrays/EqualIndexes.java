package com.geeks.ds.array.rangeQuery;

public class EqualIndexes {

	public static void main(String[] args) {
		int lowerIndex = 1;
		int heigherIndex = 8;
		int value = 2;
		int array[] = {1, 2, 2, 2, 3, 3, 4, 4, 4}; 
		System.out.println(equalIndexes(array, value, lowerIndex, heigherIndex));

	}

	 static int equalIndexes(int[] array, int value, int lowerIndex, int heigherIndex) {
		int count = 0;
		for(int i = lowerIndex; i< heigherIndex; i++) {
			if(array[i] == array[i+1]) {
				count +=1;
			}
		}
		 return count;
	}

}
