package FilesIO;
import java.io.*;
import java.util.*;

public class AirthmaticOperation {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers");
		String num = br.readLine();
		StringTokenizer T1 = new StringTokenizer(num," , ");
		String A1 = T1.nextToken();
		String A2 = T1.nextToken();
		
		A1.trim();
		A2.trim();
		
		double n1 = Double.parseDouble(A1);
		double n2 = Double.parseDouble(A2);
		
		System.out.println("Addition is : "+(n1+n2));
		System.out.println("Substraction is : "+(n1-n2));
		System.out.println("Multiplication is : "+(n1*n2));
		System.out.println("Division is : "+(n1/n2));

	}

}
