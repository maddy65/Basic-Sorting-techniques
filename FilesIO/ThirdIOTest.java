package FilesIO;
import java.io.*;

public class ThirdIOTest  {

	public static void main(String[] args)throws IOException {
		// Taking string from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		int n = Integer.parseInt(br.readLine());
		if((n%2)==0){
			System.out.println("Number is even");
			String str = br.readLine();
			System.out.println("Usn is "+str);
		}else{
			System.out.println("Number is odd");
		}
	}

}
