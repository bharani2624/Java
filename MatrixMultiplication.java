import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int result[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                for(int k=0;k<m;k++)
                {
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<m;k++)
            {
                System.out.print(result[i][k]+" ");
            }
            System.out.println("");
        }
    }
}
