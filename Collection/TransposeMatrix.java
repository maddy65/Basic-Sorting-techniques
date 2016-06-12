package ArrayTest;
import java.util.*;
public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,c;
		System.out.println("Enter number of rows and column :");
		r = sc.nextInt();
		c = sc.nextInt();
		int matrix[][];
		matrix = new int[r][c];
		System.out.println("enter matrix element");
		for(int i=0;i<r;i++)//{
			for(int j=0;j<c;j++)//{
				matrix[i][j] = sc.nextInt();
				//System.out.println(+matrix[r][c]);
			//}
		//}
		System.out.println("Transportation of matrix is");
		for(int i=0;i<c;i++){
			for(int j=0;j<r;j++){
				System.out.print(matrix[j][i]+ " ");
			}
			System.out.println("\n");
		}

	}

}
