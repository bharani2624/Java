import java.util.*;
class Sorting
{
    public static void main(String[] args)
    {
        Stack<Integer>s=new Stack<>();
        s.add(34);
        s.add(3);
        s.add(31);
        s.add(98);
        s.add(92);
        s.add(23);
        Stack<Integer> temp=new Stack<>();
        while(!s.isEmpty())
        {
            int t=s.pop();
            while(!temp.isEmpty() && temp.peek()<t)
            {
               s.push(temp.pop());
            }
            temp.push(t);
        }
        while(!temp.isEmpty())
        { 
        System.out.print(temp.pop() +" ");
        }
        } 
}
