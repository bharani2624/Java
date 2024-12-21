import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.print("Invalid");
            return ;
        }
        double sum=0.0;
        for(int i=1;i<=n;i++)
        {
            sum+=((float)1/(float)i);
        }
        System.out.printf("%.2f",sum);
    }
}
