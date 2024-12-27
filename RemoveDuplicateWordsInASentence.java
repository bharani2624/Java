import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split("[,\\s\\.]");
        Set<String> set=new HashSet<>();
        StringBuilder sbr=new StringBuilder();
        for(String s:arr)
        {
            if(!set.contains(s))
            {
                set.add(s);
                sbr.append(" ");
                sbr.append(s);
            }
        }
        System.out.print(sbr.toString().strip());
        
    }
}
