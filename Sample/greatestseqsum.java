import java.util.*;
import java.io.*;

public class greatestseqsum
{

public static void main(String args[])
    {
System.out.println("Enter size");
        Scanner Scn = new Scanner(System.in);
int n = Scn.nextInt();
int nums[] = new int[n];
System.out.println("Enter array ");
for (int i = 0; i < n; i++)
        {
nums[i] = Scn.nextInt();
        }
printLIS(nums);

    }

public static void printLIS(int[] nums)
    {
int index = 0;
        String paths[] = new String[nums.length];
int sizes[] = new int[nums.length];
for (int i = 0; i < nums.length; i++)
        {
sizes[i] = 1;
paths[i] = nums[i] + " ";
        }
int maxlength = 1;
for (int i = 1; i < nums.length; i++)
        {
for (int j = 0; j < i; j++)
            {
if (nums[i] > nums[j] && sizes[i] < sizes[j] + 1)
                {
sizes[i] = sizes[j] + 1;
paths[i] = paths[j] + nums[i] + " ";
if (maxlength < sizes[i])
                    {
maxlength = sizes[i];
                    }
                }
            }
        }
for (int i = 1; i < nums.length; i++)
        {
if (sizes[i] == maxlength)
            {
System.out.println("LIS: " + paths[i]);
index = i;

            }
        }
int sum = 0;
        StringTokenizer st = new StringTokenizer(paths[index]);
int n = st.countTokens();
for (int m = 1; m <= n; m++)
        {
sum += Integer.parseInt(st.nextToken());
        }
System.out.println("sum of lis is " + sum);
    }
}

