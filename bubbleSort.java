import java.util.*;
class Main
{
    static void bs(int arr[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count=1;
                }
            }
            if(count==0)
            {
                break;
            }
        }
        for(int i=0;i<n+1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        bs(arr,n-1);
    }
}
