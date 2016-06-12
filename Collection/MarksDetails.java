package ArrayTest;
import java.io.*;
public class MarksDetails {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Enter number of subject");
		int n = Integer.parseInt(br.readLine());
		int marks [];
		marks = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter marks");
			marks[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for(int i=0;i<n;i++){
			sum += marks[i];
		}
		float percent = sum/n;
		System.out.println("Percent is "+percent);
		
	}

}
