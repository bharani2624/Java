import java.util.*;
class Main{
public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String []arr=str.split(" ");
    String string="";
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length();j++)
        {
            if(j==0)
            {str+=Character.toUpperCase(arr[i].charAt(j));}
            else
            {
                str+=arr[i].charAt(j);
            }
        }
        str+=" ";
    }
    System.out.print(str.trim());
}
    
}
