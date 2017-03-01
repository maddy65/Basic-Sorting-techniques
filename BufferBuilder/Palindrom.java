package BufferBuilder;
import java.io.*;
public class Palindrom {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str = br.readLine();
		String temp = str;
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		str = sb.toString();
		if(temp.equalsIgnoreCase(str))
			System.out.println(temp+" Is Pallindrom");
		else System.out.println(temp + " Is Not Pallindrom");
	}

}
