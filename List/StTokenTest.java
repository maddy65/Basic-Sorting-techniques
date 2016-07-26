package FilesIO;
import java.io.*;
import java.util.*;

public class StTokenTest {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name, age and salary");
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " , ");
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		
		s1.trim();
		s2.trim();
		s3.trim();
		String name = s1;
		int age = Integer.parseInt(s2);
		int salary = Integer.parseInt(s3);
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("salary "+salary);
		

	}

}
