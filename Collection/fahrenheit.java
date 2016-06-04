package PgmSimplified;

import java.util.Scanner;

public class fahrenheit {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		n = ((n-32)*5);
		System.out.println(n);
		}

}
