 import java.math.*;

public class InvMod
{


public static void main(String args[])
{


int x=2;
long y=x;
long m=1000000007;
y=y%m;
long i=0;

for(i=0;i<m;i++)
{

if((y*i)%m==1)
break;

}
int out=(int)i;
System.out.println(out);


}
}
