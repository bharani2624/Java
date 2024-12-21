import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=1;
        if(n==0)
        {
            System.out.print(n1);
            return ;
        }
        int sum=0;
        while(sum<=n)
        {
            if(sum%2==0)
            {
                System.out.print(sum+" ");
            }
            n1=n2;
            n2=sum;
            sum=n1+n2;
        }
    }
}
