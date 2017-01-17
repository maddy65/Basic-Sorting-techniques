import java.util.*;

public class divisor
{

public static void main(String[] args)
    {
int sum = 0;
System.out.println("enter the number");
        Scanner sin = new Scanner(System.in);
int num = sin.nextInt();
for (int i = 1; i <= num / 2; i++)
        {
if (num % i == 0)
            {
sum += (i);
            }

        }
System.out.println(sum + num);
    }
}

