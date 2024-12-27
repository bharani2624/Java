import java.util.*;
class Main
{
    static int palindrome(int n)
    {
        int temp=n;
        int rem;
        int rev=0;
        while(n!=0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        // System.out.print(rev+"  ");
        if(rev==temp)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            // palindrome(arr[i]);
            if(palindrome(arr[i])==1)
            {
                System.out.print(arr[i]+" ");
            }
        }
        
    }

    
}
