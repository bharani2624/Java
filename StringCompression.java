import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        String s="";
        int count=1;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                count+=1;
            }
            else
            {
                System.out.print(str.charAt(i)+""+count);
                count=1;
            }
        }
        System.out.print(str.charAt(str.length()-1)+""+count);
    }
}
