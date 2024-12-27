import java.util.*;
class Main
{
    static String reverse(String str)
    {
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int target=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            if(i==target)
            {
                String s=reverse(arr[i]);
                System.out.println(s);
            }
        }
    }
}
