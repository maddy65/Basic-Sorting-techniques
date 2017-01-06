import java.util.Scanner;
class sample
{
public static void main(String args[])
{String str1,str2;
Scanner Scn=new Scanner(System.in);
System.out.println("Enter 2 strings");
str1=Scn.next();
str2=Scn.next();

String temp,output=null,target1=null,target2=null;
int max=0;


if(str1.length()<=str2.length()) 
{target1=str1;
target2=str2;}
else 
{target1=str2;
target2=str1;}

for(int i=target1.length()-1;i>=0;i--)
for(int j=0;j<=i;j++)
{temp=target1.substring(j,i+1);
if(target2.indexOf(temp)>=0)
if(temp.length()>max)
{output=temp;
max=temp.length();
}
}
System.out.println(max);
}
}
