package TC;
import java.util.*;
public class MultipleTable {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		for(c=a ; c<=b ; c++){
			System.out.println("Multiplication is "+ c);
			for(d=1; d<=10; d++){
				System.out.println(c*d);
			}
		}
	}

}
