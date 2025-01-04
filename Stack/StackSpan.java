import java.util.*;
class StackSpan
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        //int a[]=new int[n];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr.add(i,a[i]);
        }
        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> span=new ArrayList<>(Collections.nCopies(n, 0));
        for(int i=0;i<n;i++)
        {
        while(!s.isEmpty() && arr.get(s.peek())<=arr.get(i))
        {
            s.pop();
        }
        if(s.isEmpty())
        {
            span.set(i,i+1);
        }
        else
        {
            span.set(i,i-s.peek());
        }
        s.push(i);
        }
    }
}
