package DSProblems;
import java.util.*;

public class MatchShirt {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector Color = new Vector();
		Color.add("Red");
		Color.add("Blue");
		Color.add("Green");
		@SuppressWarnings("rawtypes")
		Vector Team = new Vector(); 
		Team.add("CSK");
		Team.add("RCB");
		Team.add("MI");
		Vector result = null;
		for(int i=0; i<Color.size(); i++){
			for(int j=0; j<Team.size(); j++){
				result = new Vector();
				result.add(Color.get(i));
				result.add(Team.get(j));
				System.out.println(result);
			}
		}
	}

}
