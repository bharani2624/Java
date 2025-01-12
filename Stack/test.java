import java.util.*;
class Test
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	String str=new String();
	str=sc.nextLine();
	Stack <Character> stk=new Stack<>();
	for(char ch:str.toCharArray())
	{
		if(ch=='('||ch=='['||ch=='{')
		{
			stk.push(ch);
		}
		else
		{
			if(stk.isEmpty())
			{
				System.out.print("Not Possible 0");
				return ;
			}
			else
			{
				char top=stk.peek();
				if((top=='(' && ch==')') || (top=='[' && ch==']') || (top=='{' && ch=='}'))
				{
				stk.pop();
				}
				else
				{
					System.out.print("Not Possible 2");
					return ;
				}
			}
		}
	}
	if(stk.isEmpty())
	{
		System.out.print("Possible");
	}
	else
	{
		System.out.print("Not Possible 3");
	}
	}
}
