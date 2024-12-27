import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replaceAll("[^\\d]","");
        str=str.strip();
        char arr[]=str.toCharArray();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]-'0');
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        System.out.print(list+" ");
        int result=list.get(set.size()-2);
        System.out.print(result);
        
    }
}
