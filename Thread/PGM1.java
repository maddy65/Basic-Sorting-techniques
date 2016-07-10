package TC;
import java.util.Scanner;


public class PGM1 {

	public static void main(String[] args) {
		int marks;
		int marks2;
		System.out.println("Enter the marks to know grade: ");
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		
		if(marks <= 40){
			System.out.println("Please Enter Original Marks: ");
			marks2 = sc.nextInt();
			if(marks2<35){
				System.out.println("Student is fail. ");
			}else{
				System.out.println("Student is pass. ");
			}
		}else{
			System.out.println("Student is passed ");
		}
		
		

	}

}
