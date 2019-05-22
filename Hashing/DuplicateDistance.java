package com.dataStructure.LinkedList.Single;

import java.util.*;

public class DuplicateDistance {
	
	static boolean checkDuplicate(int array[], int key) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<array.length; i++) {
			if(set.contains(array[i])) 
				return true;
			set.add(array[i]);
			if(i>=key)
				set.remove(array[i-key]);
		}
		return false;
	}

	public static void main(String[] args) {
		int num, sum =0 ;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		int a[] = new int[num];
		
		for(int i=0; i<num; i++) {
			a[i] = s.nextInt();
			sum = sum + a[i];
			
		}
		int dist = s.nextInt();
		
		if(checkDuplicate(sum,dist)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
