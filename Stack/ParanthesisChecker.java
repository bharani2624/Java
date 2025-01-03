import java.util.*;
class ParanthesisChecker
{
    public static void main(String[] args)
    {
        Stack<Character> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.nextLine();
        for(char ch:str.toCharArray())
        {
            if(ch=='('||ch=='['||ch=='{')
            {
                s.push(ch);
            }
            else
            {
                if(s.isEmpty())
                {
                    System.out.print("Not Possible");
                    return ;
                }
                else
                {
                   char top=s.peek();
                    if( (top=='(' && ch==')') || (top=='[' && ch==']') || (top=='{' && ch=='}') )
                    {
                        s.pop();
                    }
                    else
                    {
                        System.out.print("Not Possible");
                        return ;
                    }
                }
                     
            }
        }
        if(s.isEmpty())
        {
        System.out.print("Possible");
        }
        else
        {
        System.out.print("Not Possible");}
    }

}
