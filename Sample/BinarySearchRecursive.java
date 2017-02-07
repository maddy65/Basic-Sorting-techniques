package com.java.examples;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		
		int[] a = {7,6,5,3,2,1,0};
		int x = 11;
		int start =0;
		int end = a.length;
		int res = binarySearch(start,end,a,x);
		System.out.println(res);

	}

	private static int binarySearch(int start, int end, int[] a, int x) {
		
		if(end < start) return -1 ;
		int mid = start + ((end -start)/2);
		if(a[mid] == x )
			return mid;
		
		else if(x > a[mid]){
			end = mid-1;
			int res = binarySearch(start,end , a, x);
			return res;
		}
		else{ 
			start =mid+1;
			int res = binarySearch(start, end, a, x);
			return res;
			
		}
		
	}

}
