package Collections;
import java.io.*;
public class Group {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee arr[] = new Employee[10];
		for(int i=0; i<10; i++){
			System.out.println("Enter the id: ");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter the name: ");
			String name = br.readLine();
			arr[i] = new Employee(id,name);
		}
		System.out.println("The Employee data is");
		for(int i=0; i<10;i++){
			arr[i].displayData();
		}
	}

}
