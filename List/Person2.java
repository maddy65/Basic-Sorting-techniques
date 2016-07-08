package EProgramm;

import javax.swing.Spring;

public class Person2 {
	private String name ;
	private int age ;
	Person2(){
		name = "Raju";
		age = 36;
	}
	Person2(String s, int n){
		name = s;
		age = n;
	}
	
	public void talk(){
		System.out.println("My name is " + name);
		System.out.println("My age is " +age);
	}
}
