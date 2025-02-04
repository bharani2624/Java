import java.util.*;
class FibonacciSum
{
	static int fibSum(int n)
	{
	int dp[]=new int[n+1];
	dp[0]=0;
	dp[1]=1;
	for(int i=2;i<=n;i++)
	{
	dp[i]=dp[i-1]+dp[i-2];	
	}
	return dp[n];
	}
	public static void main(String[] args)
	{	
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum = fibSum(n);
		System.out.print(sum);

	}
}
