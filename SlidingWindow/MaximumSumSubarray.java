import java.util.*;
public class MaximumSumSubarray {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int k=sc.nextInt();
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        for(int i=0;i<k;i++) sum+=nums[i];
        int result=Integer.MIN_VALUE;
        for(int i=k;i<n;i++)
        {
            sum+=nums[i]-nums[i-k];
            result=Math.max(result, sum);
        }
        System.out.print(result);
    }
}