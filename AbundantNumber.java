import java.util.*;
class Main
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      for(int i=1;i<n;i++)
      {
          if(n%i==0)
          {
              sum+=i;
          }
      }
      if(sum>n)
      {
          System.out.print(n+" is Abundant number");
      }
      else
      {
          System.out.print(n+" is not an Abundant number");
      }
  }  
}