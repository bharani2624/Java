import java.util.*;
class Lexco
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cnt[]=new int[26];
        int visited[]=new int[26];
        String str=new String();
        str=sc.nextLine();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<26;i++)
        {
            cnt[i]=0;
            visited[i]=0;
        }
        for(int i=0;i<str.length();i++)
        {
            cnt[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++)
        {
                cnt[str.charAt(i)-'a']--;
                if(visited[str.charAt(i)-'a']>0)
                    continue;
                
                while(!stk.isEmpty() && stk.peek()<str.charAt(i) && cnt[stk.peek()-'a']!=0)
                {
                    visited[stk.peek()-'a']=0;
                    stk.pop();
                }
                stk.push(str.charAt(i));
                visited[str.charAt(i)-'a']=1;
        }
        StringBuilder sbr=new StringBuilder();          
            while(!stk.isEmpty())
            {
                //System.out.print(stk.peek());
                sbr.append(stk.pop());
            }
            System.out.print(sbr.reverse());
        
    }
}
