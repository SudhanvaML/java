
//Linear Search
import java.util.*;
class linearsearch
{
    public static void main(String []args)
    {
        int i,flag=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=s.nextInt();

        int a[]=new int[10];
        System.out.println("Enter the array elements ");
        for(i=0;i<n;i++)
            a[i]=s.nextInt();

        System.out.println("Enter the element to be searched");
        int key=s.nextInt();

        for(i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                System.out.println("Element found at " +i+ " position");
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("Element not found");
    }
}