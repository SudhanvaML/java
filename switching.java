//Case Switching

import java.util.*;
class switching
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("1.Sum   2.Diff   3.Mul   4.Div ");
        System.out.println("Enter your choice");
        int ch=s.nextInt();

        switch(ch)
        {
            case 1: System.out.println("The sum is "+(a+b));
                break;
            case 2: System.out.println("The Diff is "+(a-b));
                break;
            case 3: System.out.println("The Mul is "+(a*b));
                break;
            case 4:if(b==0)
                    {
                        System.out.println("Cannot perform this operation");
                    }
                    else
                    {
                        System.out.println("The Div is "+(a/b));
                    }
                        break;
            default:System.out.println("Enter a valid choice \n");
        }
    }
}