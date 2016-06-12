package ArrayTest;

public class TwoDArrayTest {

	public static void main(String[] args) {
		float f1[][] = {{1.6f,2.6f,3.6f},
				        {6.1f,6.2f,6.3f},
				        {2.1f,2.2f,2.3f},
				        {1.2f,2.2f,3.2f},
				        {4.5f,6.3f,9.6f}};
		for(int i=0;i<5;i++){
			for(int j=0;j<3;j++){
				System.out.print(f1[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
