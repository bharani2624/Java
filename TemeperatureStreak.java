import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                count++;
                if(arr[i]<arr[j])
                {
                    result[i]=count;
                    count=0;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
