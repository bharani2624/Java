import java.util.*;
class st
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
	Stack<Character> stk = new Stack<>();
	String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{')
            {
                stk.push(str.charAt(i));
            }
            else
            {
                if(!stk.empty() && ((stk.peek()=='(' && str.charAt(i)==')')||(stk.peek()=='[' && str.charAt(i)==']')||(stk.peek()=='{' && str.charAt(i)=='}')))
                {
                    stk.pop();
                }
                else
                {
                    System.out.print("Not A Valid Paranthesis ");
                    return ;
                }
            }
        }
    }
}
