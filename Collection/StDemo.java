package HashSet;
import java.util.*;

public class StDemo {

	public static void main(String[] args) {
		String str = "He is the gental man.";
		StringTokenizer st = new StringTokenizer(str," ");
		
		System.out.println("The tokens are ");
		while(st.hasMoreElements()){
			String one = st.nextToken();
			System.out.println(one);
		}

	}

}
