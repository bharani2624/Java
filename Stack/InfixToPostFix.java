import java.util.*;
class ItP
{
    static int prec(char ch)
    {
        if(ch=='^')
        return 3;
        if(ch=='/' ||ch=='*')
        return 2;
        if(ch=='-'||ch=='+')
        return 1;
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        Stack<Character> s=new Stack<>();
        StringBuilder sbr=new StringBuilder();
        str=sc.nextLine();
        for(char ch:str.toCharArray())
        {
            if(ch>='a' && ch<='z'||ch>='A'&&ch<='Z')
                sbr.append(ch);
            else if(ch=='(')
                s.push(ch);
            else if(ch==')')
            {
                while(!s.isEmpty() && s.peek()!='(')
                {
                    sbr.append(s.pop());
                }
                s.pop();
            }
            else
            {
                while(!s.isEmpty() && prec(ch)<=prec(s.peek()))
                {
                    sbr.append(s.pop());
                }
                s.push(ch);
            }
        }
        while(!s.isEmpty())
        {
            sbr.append(s.pop());
        }
    sc.close();
    System.out.print(sbr.toString());
    }

}
