public class SHORTEST_SUBSEQ
{

public static void main(String chr[])
    {
        String input1 = "abhyrefucceb";
        String input2 = "ebc";
int min = input1.length();
for (int i = 0; i < input1.length(); i++)
        {
for (int j = i + input2.length(); j <= input1.length(); j++)
            {
                String sub = input1.substring(i, j);
int l = 0;
for (int k = 0; k < input2.length(); k++)
                {
if (sub.indexOf(input2.charAt(k)) >= 0)
                    {
l++;
if (l == input2.length())
                        {
if (min > sub.length())
                            {
min = sub.length();
                            }
                        }
                    }
                }
            }
        }
System.out.println(min);
    }
}

