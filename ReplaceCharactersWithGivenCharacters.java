import java.util.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replaceAll("e","f");
        str=str.replaceAll("h","j");
        str=str.replaceAll("\\d","n");
        System.out.print(str);
    }
}
