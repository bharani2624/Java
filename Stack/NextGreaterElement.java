import java.util.*;
class NextGreater
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++)
        {
        int temp=-1;
        for(int j=i+1;j<n;j++)
        {
	if(arr[i]>=arr[j])
	{
	continue;
	}
	else
	{
	temp=arr[j];
	break;
	}
        }
        System.out.println(arr[i]+" -> "+temp);
        }
    }
}
