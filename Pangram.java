import java.util.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                set.add(ch);
            }
        }
        if(set.size()==26)
        {
            System.out.print("panagram");
        }
    }
    
}
