/*
 * This program for maximum sub array
 */
package DSProblems;

public class Program1 {

	public static void main(String[] args) {
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int array_length = a.length;
		int max_sum =Max_Sum(a,array_length);
		System.out.println(max_sum);
		//System.out.println(array_length);
		

	}
	private static int Max_Sum(int[] a, int array_length) {
		int max_so_far = 0;
		int max_ending_here = 0;
		for(int i=0; i<array_length; i++){
			max_ending_here = max_ending_here + a[i];
			if(max_ending_here < 0)
				max_ending_here = 0;
			if(max_so_far < max_ending_here)
				max_so_far = max_ending_here;
		}
		return max_so_far;
		
	}

}
