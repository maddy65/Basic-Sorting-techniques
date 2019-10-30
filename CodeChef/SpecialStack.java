package com.geeks.ds.stack.design;

import java.util.Stack;

public class SpecialStack extends Stack<Integer> {
	
	void stackPrint(Stack st) {
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

	public static void main(String[] args) {
		SpecialStack st = new SpecialStack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(15);
		st.push(5);
		st.push(25);
		st.stackPrint(st);
	}

}
