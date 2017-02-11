package Search;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int counter,key, n, a[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		//n = sc.nextInt();
		n = sc.nextInt();
		a = new int[n];
		System.out.println("Enter " + n + " number");
		for(counter = 0 ;counter<n; counter++)
		a[counter]=sc.nextInt();
		System.out.println("Enter Search Element");
		key = sc.nextInt();
		
		for(counter = 0 ;counter<n; counter++){
			if(a[counter]==key){
				System.out.println(key+" Counter is present at location at "+(counter+1));
				break;
			}
			
		}
		if(counter== n)
			System.out.println(key+"item does not present");
	

}
}
