package TC;
import java.util.*;
import java.math.*;

public class Sum {

	public static void main(String[] args) {
    
		String number1,number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 number");
		number1 = sc.nextLine();
		System.out.println("Enter n2 number");
		number2 = sc.nextLine();
		
		BigInteger first = new BigInteger(number1);
		BigInteger second = new BigInteger(number2);
		BigInteger sum;
		sum = first.add(second);
		System.out.println(sum);
		
		
	}

}
