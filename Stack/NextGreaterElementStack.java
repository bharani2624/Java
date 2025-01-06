import java.util.*;
class NextGreaterElementStack
{
    public staic void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        int n=sc.nextInt();
        int input[]=new int[n];
        for(int i=0;i<n;i++)
        {
            input[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr.add(i,input[i]);
        }
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=arr.get(i))
            {
            s.pop();
            }
            if(!s.isEmpty())
            {
                result.add(i,s.peek());
            }
            s.push(arr.get(i));
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(result.get(i)+" ");
        }
    }
}


