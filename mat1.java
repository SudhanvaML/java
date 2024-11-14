//Matrix ADD, SUB, MUL

import java.util.*;
public class mat1 {
    public static void main(String[] args) {
        int[][] a = new int[100][100];
        int[][] b = new int[100][100];
        int[][] addmatrix = new int[100][100];
        int[][] submatrix = new int[100][100];
        int[][] multmatrix = new int[100][100];
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        a=take(m,n);
        b=take(m,n);
        printme(a,m,n);
        printme(b,m,n);

        addmatrix=add(a,b,m,n);
        printme(addmatrix,m,n);

        submatrix=sub(a,b,m,n);
        printme(submatrix,m,n);

        multmatrix=mult(a,b,m,n);
        printme(multmatrix,m,n);
    }

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

    static void printme(int[][] a,int m,int n)
    {
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.printf("\n");
        }
        System.out.printf("\n");
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
                c[i][j]=a[i][j]-b[i][j];
        }
        return c;

    }

    static int[][] mult(int[][] a,int[][] b,int m,int n) {
        int[][] c = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }

        return c;
    }
}
