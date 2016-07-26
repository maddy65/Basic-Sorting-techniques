package FilesIO;
import java.io.*;

public class SecondIOTest {

	public static void main(String[] args)throws IOException {
		// Accepting string from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter your name");
		name = br.readLine();
		System.out.println("Your name is "+name);
	}

}
