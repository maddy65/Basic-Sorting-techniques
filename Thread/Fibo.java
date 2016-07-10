package TC;
import java.io.*;
public class Fibo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long f1=0, f2=1;
		long f = f1+f2;
		System.out.println("Enter n");
		int n = Integer.parseInt(br.readLine());
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f);
		int counter = 3;
		while(counter < n){
			f1 = f2;
			f2 = f;
			f = f1+f2;
			System.out.println(f);
			counter++;
		}
	}

}
