import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Map<Integer,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int element:arr)
        {
            if(map.containsKey(element))
            {
                map.put(element,map.get(element)+1);
            }
            else
            {
                map.put(element,1);
            }
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                sum+=entry.getKey();
            }
        }
        System.out.print(sum);
        
    }
}
