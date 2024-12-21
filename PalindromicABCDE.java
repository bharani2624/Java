import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(count++)+" ");
            }
            for(int k=count-2;k>=count-i;k--)
            {
                System.out.print((char)k+" ");
            }
            System.out.println();
        }
    }
}
