import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int product=m;
        for(int i=1;i<=n;i++)
        {
            System.out.print(product+" ");
            product=product*2;
        }
    }
}
