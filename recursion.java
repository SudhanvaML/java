//Recursion
class fact
{
    int factorial (int n)
    {
        int result;
        if (n==1)
            return 1;
        else
            result = n*factorial(n-1);
        return result;
    }
}
class recursion
{
    public static void main(String[] args)
    {
        fact f=new fact();
        System.out.println("Factorial of 5 is "+f.factorial(5));
    }
}
