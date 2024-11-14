import java.util.*;
class matric
{
    int i,j,k;
    static int[][] take(int m,int n)
    {
        int[][] a = new int[m][n];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        }
        return a;
    }
    static int[][] take1(int m,int n)
    {
        int[][] b = new int[m][n];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                b[i][j]=sc.nextInt();
        }
        return b;
    }
    static void print(int[][] a,int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println("\n");
        }
        System.out.println("\n");
    }
    static int[][] add(int[][] a,int[][] b,int m,int n)
    {
        int[][] c = new int[m][n];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++)
                c[i][j]=a[i][j]+b[i][j];
        }
        return c;
    }
    static int[][] sub(int[][] a,int[][] b,int m,int n)
    {
        int[][] c = new int[m][n];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++)
                c[i][j]=a[i][j]+b[i][j];
        }
        return c;
    }
    static int[][] mul(int[][] a,int[][] b,int m,int n)
    {
        int[][] c = new int[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                c[i][j] = 0;
                for (int k = 0; k < n; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }
        return c;
    }
}

class matrices
{
    public static void main(String[] args)
    {
        //int m,n;
        Scanner s=new Scanner(System.in);
        int a[][]=new int[20][20];
        int b[][]=new int[20][20];
        int add[][]=new int[20][20];
        int sub[][]=new int[20][20];
        int mul[][]=new int[20][20];
        System.out.println("Enter the size of the matrix");
        int n=s.nextInt();
        int m=s.nextInt();
        a=matric.take(m,n);
        b=matric.take1(m,n);

        matric.add(a,b,m,n);
        matric.print(add,m,n);

        matric.sub(a,b,m,n);
        matric.print(sub,m,n);

        matric.mul(a,b,m,n);
        matric.print(mul,m,n);

    }
}
