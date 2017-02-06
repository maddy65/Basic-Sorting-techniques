import java.util.Scanner;
public class StringCount {

	public static int countUniqueCharacters(String s) {
	    String lowerCase = s.toLowerCase();
	    char characters[] = lowerCase.toCharArray();
	    int countOfUniqueChars = s.length();
	    for (int i = 0; i < characters.length; i++) {
	        if (i != lowerCase.indexOf(characters[i])) {
	            countOfUniqueChars--;
	        }
	    }
	    return countOfUniqueChars;
	}
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		String s = "";
		String lowerCase = s.toLowerCase();
		char characters[] = lowerCase.toCharArray();
		int t = Sc.nextInt();
		 
		for(int j =0; j<t ;j++){
			s = Sc.next();
			int len = s.length();
			int abc = countUniqueCharacters(s);
			if(len >=4 && abc >= 3){
				System.out.println("Yes");
			}else{
				System.out.println("NO");
			}
			
			
		}
	}
}
