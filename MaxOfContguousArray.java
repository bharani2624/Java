import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=arr[0];
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                result=Math.max(result,sum);
            }
            sum=0;
        }
        System.out.print(result);
    }
}
