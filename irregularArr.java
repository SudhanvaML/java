class irregularArr
{
    public static void main(String[] args)
    {
        int i,j;
        int [][]a={{1,2,3},{4,5},{6}};

        System.out.println("0th row length : "+a[0].length);
        System.out.println("1st row length : "+a[1].length);
        System.out.println("2nd row length : "+a[2].length+"\n");

        for(i=0;i<a[0].length;i++)
            System.out.print(a[0][i]+"\t");
        System.out.println();
        for(i=0;i<a[1].length;i++)
            System.out.print(a[1][i]+"\t");
        System.out.println();
        for(i=0;i<a[2].length;i++)
            System.out.print(a[2][i]+"\t");
        System.out.println();
    }
}
