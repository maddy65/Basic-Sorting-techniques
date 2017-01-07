 import java.io.*;
import java.lang.*;
class stack
{
    private final int STACKSIZE=50;
    private int top;
    private char items[];
    public stack()
    {
    top=-1;
    items=new char[STACKSIZE];
    }
    public void push(char a)
    {
        if (top==STACKSIZE-1)
    {
            System.out.println("overflow");
            return;
    }
    else
            top++;
        items[top]=a;   
    }
    public boolean isEmpty()
    {
    if(top==-1)
            return true;
    else
            return false;
    }   
    public char pop()
    {
        if (top==-1)
    {
            System.out.print("empty, cannot pop");
            return ' ';
    }
    return(items[top--]);
    }
    public char peek()
    {
        if (top==-1)
    {
            System.out.println("empty, can not peek");
            return ' ';
    }
    return(items[top]);
    }
    public void display()
    {
        for(int i=top;i>=0;i--)
    System.out.println(items[i]);
    }
}
class Infix2Postfix
{
    private boolean isOpenBracket(char m)
    {
        if(m=='(')
            return true;
    else
            return false;
    }
    private boolean isOperator(char m)
    {
    if(m=='+'||m=='-'||m=='/'||m=='*')
            return true;
    else
            return false;
    }
    private boolean isOperand(char m)
    {
        if((m>='0'&& m<='9') || (m >= 'a' && m<= 'z') || (m >='A' && m<='Z'))
            return true;
    else
            return false;
    }
    private int priority(char ch)
    {
        int priority;
    priority=0;;
    switch (ch)
    {
            case'+': priority=3;
         break;
            case'-': priority=2;
         break;
            case'*': priority=5;
                 break;
            case'/': priority=4;
         break;
            case'%': priority=1;
         break;
        }
    return priority;
    }
    public void convert(String str)
    {
        char ch;
    stack s=new stack();
    int i,j;
    j=0;
    char postfix[] = new char[str.length()];
    for(i=0;i<str.length();i++)
    {   
            ch=str.charAt(i);
            if(isOpenBracket(ch))
                s.push(ch);
            else if (isOperand(ch))         
                postfix[j++]=ch;                    
            else if (isOperator(ch))
            if (s.isEmpty())
                s.push(ch);
            else
            {       
        if (priority(ch) >= priority(s.peek()))
                    s.push(ch);
        else
        {
                    while (priority(ch) < priority(s.peek()))
                    postfix[j++]=s.pop();
                    s.push(ch);
        }
            }               
            else if (!isOpenBracket(ch))
            {
                while (!isOpenBracket(s.peek()))
                    postfix[j++]=s.pop();
        if (isOpenBracket(s.peek()))
                    s.pop();
            }
    }
    while(!s.isEmpty())
    {
            postfix[j++]=s.pop();
    }
    for(i=0;i<str.length();i++)
            System.out.print(postfix[i]);
    }
}
public class Infixtopostfix 
{
    public static void main(String[] args) throws IOException
    {
        String str;
    Infix2Postfix in2post = new Infix2Postfix();
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    System.out.println();
    System.out.println("Enter an expression in infix notation");
    str=obj.readLine();
        System.out.println("Postfix notation is");
        in2post.convert(str);
    }
}
