import java.util.*;
public class run
{
public static String encode(String source) 
{
    StringBuffer dest = new StringBuffer();
    for (int i = 0; i < source.length(); i++)
   {
        int runLength = 1;
        while (i + 1 < source.length() && source.charAt(i) == source.charAt(i + 1))
                
	{
            runLength++;
            i++;
        }
        dest.append(runLength);
        dest.append(source.charAt(i));
    }
    return dest.toString();
}
public static void main(String args[])
{
Scanner scn=new Scanner(System.in);
System.out.println("Input string");

String source=scn.next();
System.out.println("Output "+encode(source));


}
}
