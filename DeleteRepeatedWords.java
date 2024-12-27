import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] arr=str.split("\\s");
        Set<String> words=new LinkedHashSet<>(Arrays.asList(arr));
        String result=String.join(" ",words);
        System.out.print(result);
    }
}
