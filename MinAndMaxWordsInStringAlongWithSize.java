import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int maxvar=-1;
        int minvar=-1;
        
        List<String>maxlist=new ArrayList<>();
        List<String>minlist=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i].length())
            {
                max=arr[i].length();
                maxvar=i;
                maxlist.clear();
                maxlist.add(arr[i]);
            }
            else if(max==arr[i].length())
            {
                maxlist.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i].length())
            {
                min=arr[i].length();
                minvar=i;
                minlist.clear();
                minlist.add(arr[i]);
            }
            else if(min==arr[i].length())
            {
                minlist.add(arr[i]);
            }
        }
        System.out.print(maxlist+" "+minlist);
    }
}
