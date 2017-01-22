
import java.util.*;

import java.io.*;

public class HelloWorld
{

    
 public static void main(String []args)
{
    
 int[] arr=new int[100];
     
 int temp;
    
  System.out.println("enter the no of elements");
 
     Scanner sin=new Scanner(System.in);
  
    int length=sin.nextInt();
       
System.out.println("enter the elements");
 
     for(int i=0;i<length;i++)
    
  {
        
  arr[i]=sin.nextInt();
   
   }
      
     
 for(int j=0;j<length/2;j++)
   
   {
         
 temp=arr[j];
          
arr[j]=arr[length-j-1];
         
 arr[length-j-1]=temp;
    
  }
     for(int k=0;k<length;k++)
  System.out.println(arr[k]);
}
}
