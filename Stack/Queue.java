import java.util.*;
class SQ
{
	static class Queue
	{
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	static void en(int x)
	{
	while(!s1.isEmpty())
	{
	s2.push(s1.pop());
	}
	while(!s2.isEmpty())
	{
	s1.push(s2.pop());
	}
	}
	}
	
	public static void main(String[] args){}
}
