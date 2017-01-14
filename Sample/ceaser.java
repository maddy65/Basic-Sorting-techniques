import java.util.*;


public class ceaser
{

     public static void main(String args[]){
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter plain text");
	String input=scn.next();
	int l=input.length();
	char o[]=new char[l];
        System.out.println("CIPHER TEXT : ");         
                 for(int i=0;i<l;i++)
                 {
                        char a=input.charAt(i);
			int b=(int)a;
			b=b-3;
				if(b==94)
				b=120;
				if(b==95)
				b=121;
				if(b==96)
				b=122;
			
				char m=(char)b;
			
				o[i]=m;
		
		}
	String output=new String(o);

	System.out.println(o);

}	

}
