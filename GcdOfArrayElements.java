import java.util.*;
class Main
{
    static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=arr[0];
        for(int i=1;i<n;i++)
        {
            result=gcd(result,arr[i]);
            if(result==1)
            {
                System.out.print(1);
                return ;
            }
        }
        System.out.print(result);
    }
}
