 import java.util.Scanner;
import java.lang.*;
class modular{
public static void main(String[] args)
{

Scanner s=new Scanner(System.in);
System.out.println("enter the value of a");
int x=s.nextInt();

System.out.println("enter the value of b");
int y=s.nextInt();

System.out.println("enter the value of c");

int z=s.nextInt();

double w=Math.pow(x,y);
int e=(int)w;
System.out.println(e); 
int f=e % z;
System.out.println(f); 

}

}

