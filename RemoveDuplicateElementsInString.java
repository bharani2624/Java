import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toLowerCase().toCharArray();
        Set<Character> set=new HashSet<>();
        StringBuilder sbr=new StringBuilder();
        int i=0;
        for(char ch:arr)
        {
            if(!set.contains(ch))
            {
                set.add(ch);
                sbr.append(str.charAt(i));
            }
            i++;
            
        }
       System.out.print(sbr);
    }
}
