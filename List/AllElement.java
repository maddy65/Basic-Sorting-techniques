package PgmSimplified;

public class AllElement {

	public static void main(String[] args) {
		 String s = "Pack my box with five dozen liquor jugs.";
		    int i=0;
		    for(char c : s.toCharArray()) {
		        int x = Character.toUpperCase(c);
		        if (x >= 'A' && x <= 'Z') {
		            i |= 1 << (x - 'A');
		        }
		    }
		    if (i == (i | ((1 << (1 + 'Z' - 'A')) - 1))) {
		        System.out.println("ok");
		    }

	}

}
