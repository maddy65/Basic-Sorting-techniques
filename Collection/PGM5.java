package TC;
import java.util.Scanner;

public class PGM5 {

	public static void main(String[] args) {
		int n,c;
		System.out.println("Enter the integer");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(c=1;c<=10;c++){
			System.out.println(n*c);
		}
	}

}
