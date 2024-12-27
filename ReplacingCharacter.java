import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replace('a','b');
        str=str.replace('e','f');
        str=str.replaceAll("\\d","d");
        System.out.print(str);
    }
}
