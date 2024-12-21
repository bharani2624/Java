import java.util.*;
class Main
{
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        // double sum=0;
        // double product=1;
        // int count=0;
        float sum,t,d;
        //for(int i=0;i<m;i++)
        //{
            // product=(Math.pow(n,count)/(double)fact(count));
            // if(i%2==0)
            // {
            //     sum+=product;
            // }
            // else
            // {
            //     sum-=product;
            // }
            // count+=2;
        //}
        sum=1;
        t=1;
        for(int i=1;i<m;i++)
        {
            d=(2*i)*(2*i-1);
            t=-t * n * n /d;
            sum=sum+t;
        }
        System.out.printf("%.2f",sum);
    }
}
