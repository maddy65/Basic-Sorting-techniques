package DSProblems;

public class LongestCommonSubsequent {

	public static void main(String[] args) {
		char [] Str1 = {'A','G','G','T','A','B'};
		char [] Str2 = {'G','X','T','X','A','Y','A'};
		int m = Str1.length;
		int n = Str2.length;
		System.out.println(lcs(Str1,Str2,m,n));
		

	}
	static int max(int a, int b){
		return (a>b)?a:b;
	}
	static int lcs(char[] str1, char[] str2, int m, int n) {
		if(m == 0 || n == 0)
			return 0;
		if(str1[m-1] == str2[n-1])
			return 1+ lcs(str1,str2,m-1,n-1);
		else return max(lcs(str1,str2,m,n-1),lcs(str1,str2,m-1,n));
		
	}

}
