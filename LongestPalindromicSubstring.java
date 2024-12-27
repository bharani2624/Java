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
        String s="";
        String pa="";
        str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                for(int k=i;k<=j;k++)
                {
                    s+=str.charAt(k);
                    // System.out.println(s);
                }
                if(palindrome(s)==1 && pa.length()<s.length())
                {
                    pa="";
                    pa+=s;
                }
                s="";
                
            }
        }
        System.out.print(pa+" ");
    }
}
