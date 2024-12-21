import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int base=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        int seriesSum=0;
        while(m!=0)
        {
            sum=sum*10+base;
            seriesSum+=sum;
            System.out.print(sum+" ");
            m--;
        }
        System.out.println();
        System.out.print(seriesSum);
    }
}
