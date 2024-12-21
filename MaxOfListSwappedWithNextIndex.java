import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int v=sc.nextInt();
            list.add(v);
        }
        System.out.print(list);
        for(int i=0;i<n;i++)
        {
            if(list.get(i)==Collections.max(list))
            {
                int next=list.get(i+1);
                int curr=list.get(i);
                list.set(i,next);
                list.set(i+1,curr);
                System.out.print(list);
                return ;
            }
        }
        
    }
}
