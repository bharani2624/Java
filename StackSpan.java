import java.util.*;
class StackSpan
{
    public static void main(String[] args)
    {
        List<Integer> span=new ArrayList<>();
        List<Integer> input=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            input.add(i,arr[i]);
        }
        //List<int> input=Arrays.asList(arr);
        for(int i=0;i<n;i++)
        {
            span.add(i,1);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i-1;j>=0 && input.get(i)>=input.get(j);j--)
            {
                span.set(i,span.get(i)+1);
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(span.get(i)+" ");
        }
    }
}
