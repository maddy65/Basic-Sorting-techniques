package CollectionTest;
import java.io.*;

public class Group {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee arr[] = new Employee[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter Name");
			String name = br.readLine();
			System.out.println("Enter Department");
			String department = br.readLine();
			System.out.println("Enter ID");
			String id = br.readLine();
			System.out.println("Enter Salary");
			String salary = br.readLine();
			System.out.println("Enter Sex");
			//char sex = (char)br.read();
			String sex = br.readLine();
			arr[i] = new Employee(name,department,id,salary,sex);
		}
		System.out.println("\n Employee data is:");
		for(int i=0;i<arr.length;i++){
			arr[i].displayData();
		}
	}

}
