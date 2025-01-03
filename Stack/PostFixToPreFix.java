import java.util.*;
class PostFixToPrefix
{
    static boolean isOperand(char ch)
    {
        return ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'));
    }
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
    Stack<String> s=new Stack<>();
    for(int i=0;i<str.length();i++)
    {
        if(isOperand(str.charAt(i)))
        {
            s.push(str.charAt(i)+"");
        }
        else
        {
            String op1=s.peek();
            s.pop();
            String op2=s.peek();
            s.pop();
            s.push(str.charAt(i)+op2+op1);
        }
    }
    String res=s.peek();
    System.out.print(res);
    }
}
