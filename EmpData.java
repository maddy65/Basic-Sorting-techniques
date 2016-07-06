package FilesIO;
import java.io.*;

public class EmpData  {

	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ID :");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Sex (M/F) :");
		//char sex = br.readLine().charAt(0);
		char sex = (char)br.read();
		br.skip(2);
		System.out.println("Enter name :");
		String name = br.readLine();
		System.out.println("Id is: " +id);
		System.out.println("Sex is: "+sex);
		System.out.println("Name is : "+name);

	}

}
