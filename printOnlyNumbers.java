import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replaceAll("[^\\d]"," ");
        str=str.trim();
        str=str.replaceAll(" +"," ");
        String arr[]=str.split(" ");
        for(String s:arr)
        {
            System.out.println(s);
        }
    }
}
