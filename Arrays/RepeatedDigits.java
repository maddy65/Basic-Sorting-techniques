package com.geeks.ds.array.rangeQuery;

import java.util.LinkedHashSet;

public class RepeatedDigits {

	static int repeateddigits(int value) {
		LinkedHashSet<Integer> st = new LinkedHashSet<>();
		while(value != 0) {
			int d = value%10;
			if(st.contains(d)) {
				return 0;
			}
			st.add(d);
			value = value/10;
		}
		return 1;
	}
	public static int calculate(int initialValue, int finalValue) {
		int answer = 0;
		for(int i = initialValue; i< finalValue+1; i++) {
			answer = answer+repeateddigits(i);
		}
		return answer;
		
	}
	public static void main(String[] args) {
		int initialValue = 1;
		int finalValue =12;
		System.out.println(calculate(initialValue,finalValue));
	}

}
