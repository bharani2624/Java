import java.util.*;
class Main
{
    static int prime(int start,int n)
    {
        if(n==0||n==1)return 0;
        if(n==2||n==3)return 1;
        if(start>n) return 0;
        if(start*start>n)return 1;
        if(n%start==0)return 0;
        return prime(start+1,n);
    }
    // static int prime(int n)
    // {
    //     int sum=0;
    //     if(n%2==0)
    //     {
    //         sum+=2;
    //     }
    //     while(n%2==0)
    //     {
    //         n=n/2;
    //     }
    //     for(int i=3;i<=Math.sqrt(n);i+=2)
    //     {
    //         if(n%i==0)
    //         {
    //             n=n/i;
    //         }
    //         while(n%i==0)
    //         {
    //             n=n/i;
    //         }
    //     }
    //     if(n>2)
    //     {
    //         sum=sum+n;
    //     }
    //     return sum;
    // }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=prime(n);
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                if(prime(2,i)==1)
                {
                  sum+=i;  
                System.out.print(i+" ");
                }
            }
        }
        System.out.print(sum);
    }
}
