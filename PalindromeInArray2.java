import java.util.*;
class Main
{
    static int palindrome(String str)
    {
        String result="";
        for(int i=str.length()-1;i>=0;i--)
        {
            result+=str.charAt(i);
        }
        if(str.equals(result))
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        String result="";
        str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                String substring=str.substring(i,j+1);
                if(palindrome(substring)==1 && result.length()<substring.length())
                {
                    result=substring;
                }
                substring="";
            }
        }
        System.out.print(result);
    }
}
