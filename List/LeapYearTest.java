package FilesIO;
import java.io.*;
public class LeapYearTest {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		System.out.println("enter year");
		year = Integer.parseInt(br.readLine());
		
		if(year % 100 == 0 && year % 400 == 0) {
			System.out.println("It is leap year");
		}else if(year % 100 != 0 && year %4 ==0){
			System.out.println("It is leap year");
		}else{
			System.out.println("It is not leap year");
		}

	}

}
