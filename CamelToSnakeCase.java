import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        String s;
        str=sc.nextLine();
        s=str.toLowerCase();
        String result="";
        result+=s.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                result+="_";
            }
           
                result+=s.charAt(i);
            
        }
        System.out.print(result);
    }
}
