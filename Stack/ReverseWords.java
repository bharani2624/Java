import java.util.*;
class ReverseWords
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
               s.push(str.charAt(i)); 
            }
            else
            {
                while(!s.isEmpty())
                {
                    System.out.print(s.pop());
                }
            System.out.print(" ");
            }
        }
        while(!s.isEmpty())
        {
        System.out.print(s.pop());
        }
    }
}
