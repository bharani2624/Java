import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.strip();
        String str[]=s.split("\\s");
        for(String word:str)
        {
            String res="";
            res+=word.charAt(0);
            System.out.print(res.toUpperCase()+".");
            res="";
        }
    }
}
