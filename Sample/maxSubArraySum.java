
public class sum_positive_num
{
static int max(int x, int y)
    {
return (y > x) ? y : x;
    }

static int maxSubArraySum(int a[], int size)
    {
//   int max_so_far = a[0], i;
//   int curr_max = a[0];
// 
//   for (i = 1; i < size; i++)
//   {
//        curr_max = max(a[i], curr_max+a[i]);
//        max_so_far = max(max_so_far, curr_max);
//   }
//   return max_so_far;

int max_so_far = 0, max_ending_here = 0;
int i;
for (i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];

if (max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
            }
if (max_ending_here < 0)
            {
                max_ending_here = 0;
            }
        }

return max_so_far;
    }

public static void main(String[] args)
    {

int a[] =
        {
            -1, -1, 2, -9, 8, 10, -5
        };
int n = a.length;
int max_sum = maxSubArraySum(a, n);
System.out.println("Maximum contiguous sum is " + max_sum);

    }
}
