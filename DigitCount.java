import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int count=0;
        if(n<0)
        {
            n=Math.abs(n);
        }
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        System.out.print(count);
    }
}

