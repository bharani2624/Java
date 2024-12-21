import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=(int)Math.log10(n)+1;
        if(count<=1||n<=9)
        {
            System.out.print("Invalid Number");
        }
        int last=n%10;
        last=last*(int)Math.pow(10,count-2);
        int first=n/(int)(Math.pow(10,count-1));
        n=n%(int)(Math.pow(10,count-1));
        n=n/10;
        if((last+n)*10+first<10)
        {
            for(int i=0;i<count-1;i++)
            {
                System.out.print(0);
            }
            System.out.print((last+n)*10+first);
            return ;
        }
        System.out.print((last+n)*10+first);
        
    }
}
