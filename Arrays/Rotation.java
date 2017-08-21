package geeksforgeeks;
import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int shift = sc.nextInt();
		int array[] = new int[n];
		for(int i=0; i<n; i++){
			array[i] = sc.nextInt();
		}
		Rotation RT = new Rotation();
		RT.printArray(array);
		//RT.leftRotation(array,shift);
		//RT.leftRotationReverse(array, shift);
		RT.cyclicRotation(array);
		System.out.println(" ");
		RT.printArray(array);
	}
	/*
	 *  The following method is Normal rotation method with time complexity O(n*d)
	 */
	void leftRotation(int a[],int shift){
		for(int i=0; i<shift; i++){
			int temp = a[0];
			int j;
			for(j=0; j<a.length-1; j++){
				a[j] = a[j+1];
				a[j] = temp;
			}
		}
	}
	
	/*
	 * The following method is reversal Algorithm with time complexity O(n).
	 */
	void leftRotationReverse(int a[],int shift){
		int length = a.length;
		reverseArr(a,0,shift-1);
		reverseArr(a,shift,length-1);
		reverseArr(a,0,length-1);
	}
	
	/*
	 * The following method is used for cyclic rotation
	 */
	
	static void cyclicRotation(int a[]){
		int temp = a[a.length-1];
		for(int i=a.length-1; i>0; i--){
			a[i] = a[i-1];
		}
		a[0] = temp;
	}
	/*
	 * Function to reverse Array 
	 */
	
	static void reverseArr(int a[],int start,int end){
		int temp;
		while(start<end){
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start ++;
			end --;
		}
	}
	/*
	 * The following method is method for Printing an array.
	 */
	void printArray(int a[]){
		int length = a.length;
		for(int i=0;i<length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
