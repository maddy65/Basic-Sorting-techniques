import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
public static void main (String[] args) throws java.lang.Exception
{
String input1= "5+x=7";
int output1;
char eqn[] = input1.toCharArray();
int n1 = input1.indexOf('+');
int n2 = input1.indexOf('=');
int n3 = input1.length();
int num1=0, num2=0, num3=0;
int temp,i;
for(i=0;i<n1;i++)
{
if(eqn[i]=='x')
break;
else
{
temp=eqn[i];
temp= temp-48; // converting ascii code to number.
num1=num1*10 + temp;
}
}
for(i=n1+1;i<n2;i++)
{
if(eqn[i]=='x')
break;
else
{
temp=eqn[i];
temp= temp-48; // converting ascii code to number.
num2=num2*10 + temp;
}
}
for(i=n2+1;i<n3;i++)
{
if(eqn[i]=='x')
break;
else
{
temp=eqn[i];
temp= temp-48; // converting ascii code to number.
num3=num3*10 + temp;
}
}
int x = num1+num2-num3;
if(x<0)
x=-x;
output1=x;
System.out.println(+output1);
}
}
