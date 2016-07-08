package EProgramm;

import java.io.*;

public class Person3 {
	private String name;
	private int age;
	
	/*public void accept() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		name = br.readLine();
		System.out.println("Enter age");
		age = Integer.parseInt(br.readLine());
	}*/
	Person3(String s, int a){
		name = s;
		age = a;
	}
	public void check(){
		if(age>30){
			System.out.println(name + "are young");
		}else{
			System.out.println(name +"is old");
		}
	}
}
