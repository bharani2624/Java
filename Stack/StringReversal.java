import java.util.*;
class StringReversal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        Stack<Character> s=new Stack<>();
        str=sc.nextLine();
        for(char ch:str.toCharArray())
        {
            s.push(ch);    
        }
        StringBuilder sbr=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            sbr.append(s.pop());
        }
        System.out.print(sbr.toString());
    }
}
