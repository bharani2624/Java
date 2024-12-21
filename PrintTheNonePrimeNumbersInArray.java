import java.util.*;
class Main
{
    static int prime(int start,int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        if(start*start>n)
        {
            return 1;
        }
        else if(n%start==0)
        {
            return 0;
        }
        return prime(start+1,n);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(prime(2,arr[i])==1)
            {
                continue;
            }
            System.out.print(arr[i]+" ");
        }
    }
}

