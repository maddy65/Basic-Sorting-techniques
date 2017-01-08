import java.util.*;
import java.text.DecimalFormat;

public class mean_median_mode
{

public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("#.000000");
int a[] =
        {
            2, 2, 3, 3, 4, 4
        };

        //calculate mean
double sum = 0.000000;
for (int i = 0; i < a.length; i++)
        {
sum = sum + (double) a[i];
        }
System.out.println("mean is " + df.format(sum / a.length));

        //calculate mode
int middle = a.length / 2;

if (a.length % 2 == 1)
        {
            //odd no. of elements
System.out.println("median is " + df.format(a[middle]));
        } else
        {
//even no.
double op = ((double) a[middle - 1] + (double) a[middle]) / 2.000000;
System.out.println("median is " + df.format(op));
        }

        //calculate mode
Arrays.sort(a);
int count2 = 0;
int count1 = 0;
int pupular1 = 0;
int popular2 = 0;

for (int i = 0; i < a.length; i++)
        {
            pupular1 = a[i];
            count1 = 0;    //see edit

for (int j = i + 1; j < a.length; j++)
            {
if (pupular1 == a[j])
                {
count1++;
                }
            }

if (count1 > count2)
            {
                popular2 = pupular1;
                count2 = count1;
            } else if (count1 == count2)
            {
                popular2 = Math.min(popular2, pupular1);
            }
        }
System.out.println("mode is " + popular2);
    }
}

