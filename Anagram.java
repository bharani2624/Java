import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String str1=s1;
        String str2=s2;
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        s1=new String(ch1);
        s2=new String(ch2);
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.print(str1+" and "+str2+" Anagram");
        }
        else
        {
            System.out.print(str1+" and "+str2+" are not Anagram");
        }
    }
}
