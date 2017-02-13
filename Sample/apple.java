public class apples
{
public static int output;
public static void moveApples(int n,int[] p)
{ 
output=0;
int totalApples=arrSum(p);
int oneBasket=totalApples/n;
for(int a:p)
{
if(a>oneBasket)
output+=(a-oneBasket);
}
}
public static int arrSum(int[] p)
{
int sum=0;
for(int a:p)
{
sum+=a;
}
return sum;
}
public static void main(String[] args)
    {
int n=3;
int a[]={10,8,5};
moveApples(n,a);
System.out.println("op is : "+ output);
    }
}

