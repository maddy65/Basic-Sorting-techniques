import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
      //getting input
        int m=0,n=0;
        System.out.println("enter the number of elements");
        Scanner sin=new Scanner(System.in);
        int input1=sin.nextInt();
        System.out.println("enter the elements of array");
        int[] input2=new int[100];
         int[] output2=new int[100];
        for(int i=0;i<input1;i++)
        input2[i]=sin.nextInt();

        //printing the input
        System.out.println("the no of elements are "+input1+"\nthe array contains");
        for(int j=0;j<input1;j++)
        System.out.println(input2[j]);

        //checking for duplicates
        for(int k=0;k<input1;k++)
        {
            for(int l=k+1;l<input1;l++)
            {
               
               if(input2[k]==input2[l])
               {
               output2[m]=input2[l];
               m++;
               break;
               }
               
            }
            
        }

        System.out.println("the duplicates are ");
        while(output2[n]!='\0')
        {
            System.out.println(+output2[n]);
            n++;
        }
        
     }
}






import java.util.*;


public class duplicates{

     public static void main(String []args)
{
      

        int m=0,n=0;
int count=0;

        System.out.println("Enter number of elements");
        Scanner Scn=new Scanner(System.in);
        int input1=Scn.nextInt();
        System.out.println("Enter the elements of array");
        int[] input2=new int[input1];
         

        for(int i=0;i<input1;i++)
        input2[i]=Scn.nextInt();

       

        	for(int i=0;i<input1;i++)
                for(int j=i+1;j<input1;j++)
                if(input2[i]==input2[j])
			count++;

		int[] output2=new int[count];

        	 for(int i=0;i<input1;i++)
           	 for(int j=i+1;j<input1;j++)
           	     if(input2[i]==input2[j])
               {
               output2[m]=input2[j];
               m++;
               }
               
System.out.println("Duplicates are: ");
for(m=0;m<count;m++)
System.out.println(output2[m]);
            
            
        }

        
        
     
}


