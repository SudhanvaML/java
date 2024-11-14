import java.util.*;
class matrix
{
    public static void main(String[] args)
    {
        int i,j,k;
        Scanner s=new Scanner(System.in);
        int a[][]=new int[20][20];
        int b[][]=new int[20][20];
        int c[][]=new int[20][20];
        System.out.println("Enter the size of the matrix");
        int n=s.nextInt();
        System.out.println("Enter the A matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the B matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("Addition of matrices is :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Subtraction of matrices is :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of matrices is :");
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                c[i][j] = 0;
                for (k = 0; k < n; k++)
                {
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
