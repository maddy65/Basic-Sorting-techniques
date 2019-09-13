package com.geeks.ds.queue.operation;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueRec {

	static Queue<Integer> queue;
	
	static void print() {
		while(!queue.isEmpty()) {
			System.out.print(queue.peek()+" ");
			queue.remove();
		}
	}
	
	static Queue<Integer> reverse(Queue<Integer> qu){
		if(qu.isEmpty()) {
			return qu;
		}
		int data = qu.peek();
		qu.remove();
		
		qu = reverse(qu);
		qu.add(data);
		
		return qu;
	}
	
	public static void main(String[] args) {
		queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		queue.add(100);
		queue = reverse(queue);
		print();

	}

}
