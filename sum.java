//For and Foreach Loop
import java.util.*;
class sum
{
    public static void main(String []args)
    {
        int i,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=s.nextInt();

        int a[]=new int[10];
        System.out.println("Enter the array elements ");
        for(i=0;i<n;i++)
            a[i]=s.nextInt();

        for(int ele:a)
            sum=sum+ele;

        System.out.println("The sum is "+sum);
    }
}