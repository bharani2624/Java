import java.util.*;
class Main
{
    static int prime(int start,int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(start>n)
        {
            return 0;
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
        int i=5;
        n++;
        while(i!=0)
        {
            if(prime(2,n)==1)
            {
                System.out.println(n);
                i--;
            }
            n++;
        }
    }
}
