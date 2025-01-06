import java.util.*;
class Del
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String str=new String();
            str=sc.nextLine();
            Stack<String> s=new Stack<>();
            String[] arr=str.split(" ");
            int flag=0;
            int count=0;
            for(String word:arr)
            {
                while(!s.isEmpty() && word.equals(s.peek()))
                {
                    s.pop();
                    flag=1;
                }
                if(flag==0)
                    s.push(word);
                flag=0;
                
            }
            while(!s.isEmpty())
            {   count++;
                System.out.print(s.pop()+" ");
            }
            System.out.print(count);
        }
}
