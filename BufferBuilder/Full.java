package BufferBuilder;
import java.io.*;
public class Full {
	public static void main(String args[]) throws IOException{
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter surname ");
		String surName = br.readLine();
		System.out.println("Enter Middle Name");
		String midName = br.readLine();
		System.out.println("Enter LastName");
		String LName = br.readLine();
		sb.append(surName);
		sb.append(LName);
		System.out.println("Name " + sb);
		int n = sb.length();
		System.out.println(n);
		System.out.println(sb.reverse());
	}
}
