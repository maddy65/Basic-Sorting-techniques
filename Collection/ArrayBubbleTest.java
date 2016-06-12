package ArrayTest;
import java.io.*;
public class ArrayBubbleTest {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,numb[],temp;
		System.out.println("Enter number of elemnt to be sort");
		n = Integer.parseInt(br.readLine());
		numb = new int[n];
		boolean flag = false;
		for(int i=0;i<n;i++){
			numb[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(numb[j]>numb[j+1]){
					temp = numb[j];
					numb[j] = numb[j+1];
					numb[j+1]=numb[j];
					flag = true;
				}
			}
			if(flag = false) break;
			else flag = false;
		}
		System.out.println("Sorted array is : ");
		for(int i=0; i<n; i++){
			System.out.println(numb[i]);
		}
	}

}
