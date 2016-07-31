package DSProblems;

public class ReverseArray {

	public static void main(String[] args) {
		int[] S1 = {10,20,30,40,50,60};
		printArray(S1,4);
		reverseArray(S1,0,5);
		printArray(S1,4);

	}
	static void reverseArray(int arr[],int start, int end){
		int temp;
		if(start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArray(arr,start+1,end-1);
	}
	static void printArray(int arr[],int size){
		int i;
		for(i=0; i<size; i++){
			System.out.println(arr[i]+" ");
			System.out.println("");
		}
	}

}
