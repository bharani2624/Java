import java.util.*;
class NearestElement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> s=new Stack<>();
        int input[]=new int[n];
        for(int i=0;i<n;i++)
        {
            input[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           arr.add(i,input[i]); 
        }
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty() && s.peek()>=arr.get(i))
                s.pop();
            if(!s.isEmpty())
                res.add(i,s.peek());
            s.push(arr.get(i));
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(res.get(i));
        }
    }
}
