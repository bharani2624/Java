import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0||n<=0)
        {
            System.out.print("Please enter a valid odd number");
            return ;
        }
        int product=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                product*=i;
            }
        }
        System.out.print(product);
    }
}
