import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String []arr=str.split("\\s");
        for(String s:arr)
        {
            try
            {
                int number=Integer.parseInt(s);
                System.out.println(number);
            }
            catch(NumberFormatException e)
            {
             continue;   
            }
        }
    }
}
