import java.util.*;
class Evaluate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
	String str=new String();
	str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                s.push(str.charAt(i)-'0');
            }
            else
            {
                int const1=s.peek();
                s.pop();
                int const2=s.peek();
                s.pop();
                switch(str.charAt(i)){
                    case '+':
                        s.push(const2+const1);
                        break;
                    case '-':
                        s.push(const2-const1);
                        break;
                    case '*':
                        s.push(const2*const1);
                        break;
                    case '/':
                        s.push(const2/const1);
                        break;
                }
                ;
            }
        }
        System.out.print(s.peek());

    }
}
