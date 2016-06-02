package Collections;
import java.util.*;
import java.io.*;

public class StackDemo {

	public static void main(String[] args) throws IOException {
		
		Stack<Integer> St = new Stack<Integer>();
		int choice=0;
		int position, element;
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		while(choice<4){
			System.out.println("Stack Operation");
			System.out.println("1. Push an element");
			System.out.println("2. Pop an element");
			System.out.println("3. Search an element");
			System.out.println("4. Exit");
			System.out.println("Your Choice");
			
			choice = Integer.parseInt(Br.readLine());
			switch(choice){
			case 1: System.out.println("Enter element: ");
					element = Integer.parseInt(Br.readLine());
			 		St.push(element);
			 		break;
			case 2: Integer Obj = St.pop();
					System.out.println("Pop object is: "+Obj);
					break;
			case 3: System.out.println("Which element ?");
			 		element = Integer.parseInt(Br.readLine());
			 		position = St.search(element);
			 		if(position == -1){
			 			System.out.println("Element not found.");
			 		}else{
			 			System.out.println("Element fount at : "+position);
			 		}
			 		break;
			default :
			return;
			}
			System.out.println("Stack Contains: "+St);
		}
		
	}

}
