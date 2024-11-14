import java.util.*;
class transpose
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner s=new Scanner(System.in);
        int a[][]=new int[20][20];
        int b[][]=new int[20][20];
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
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        System.out.println("Before Transpose matrix is :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After Transpose matrix is :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
