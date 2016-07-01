package CollectionTest;
import java.io.*;

public class Employee {

		String name;
		String department;
		String id;
		String salary;
		String sex;
		
		Employee(String n,String d, String i, String sal, String se){
			name = n;
			department = d;
			id = i;
			salary = sal;
			sex = se;
		}
		void displayData(){
			System.out.println(name+"\t"+department+"\t"+id+"\t"+salary+"\t"+sex);
		}

}
