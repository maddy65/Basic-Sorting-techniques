


import java.io.*;
class prNext
{ public static void main(String Ar[])
{ int a=0,i,j;
DataInputStream ins=new DataInputStream(System.in);
try
{ System.out.println(“Enter the no.:”);
a=Integer.parseInt(ins.readLine());
}
catch(IOException e)
{}
for(j=a+1;;j++)
{ for(i=2;i<j;i++)
{ if(j%i==0)
break;
}
if(i==j)
{ System.out.println(“Next prime no is:”+j);
break;
}
}
}
}


import java.util.Scanner;
public class NxtPrime {
private static int flag;
    private static int n;
    private static int m;
    private static int i;
    private static int count;
    private static int j;

public static void main(String[] args) {
int i,n,flag=1,count,j,m;
Scanner in=new Scanner(System.in);
System.out.print("enter value of n =");
n= in.nextInt();
m=n+1; 
for(i=m;flag!=0;i++)
{
count=0;
for(j=2;j<m;j++)
{
if(i%j==0)
count+=1;
}
if(count==0)
flag=0;

}System.out.print("next prime num is "+(i-1)); // TODO code application logic here
}

}


