

public class scalar_multiplication
{
static int MatrixChainOrder(int p[], int i, int j)
    {
if (i == j)
        {
return 0;
        }
int k;
int min = 32767;
int count;

        // place parenthesis at different places between first and last matrix,
        // recursively calculate count of multiplcations for each parenthesis 
        // placement and return the minimum count
for (k = i; k < j; k++)
        {
count = MatrixChainOrder(p, i, k)
                    + MatrixChainOrder(p, k + 1, j)
                    + p[i - 1] * p[k] * p[j];

if (count < min)
            {
min = count;
            }
        }

        // Return minimum count
return min;
    }

// Driver program to test above function
public static void main(String[] args)
    {

int arr[] =
        {
            40, 20, 30, 10, 30
        };
int n = arr.length;

System.out.println("Minimum number of multiplications is  " + MatrixChainOrder(arr, 1, n - 1));

    }

}
