import java.util.*;
class Main
{
    static int leap(int year)
    {
        if(year%4==0 && year%100!=0||year%400==0)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int leapCount=0,nonleapCount=0;
        int count=10;
        n++;
        while(count!=0)
        {
            if(leap(n)==1)
            {
                leapCount++;
            }
            else
            {
                nonleapCount++;
            }
            n++;
            count--;
        }
        System.out.print("Leap Years: "+leapCount+"\n"+"Non-Leap Years: "+nonleapCount);
    }
}
