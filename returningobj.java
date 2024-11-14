//Returning objects
class Test1
{
    int i;
    Test1(int i)
    {
        this.i = i;
    }
    Test1 increment()
    {
        return new Test1(i+10);
    }
}
 class returningobj
{
    public static void main(String[] args)
    {
        Test1 obj1 = new Test1(10);
        System.out.println("Before Incrementing : "+obj1.i);
        Test1 obj2=obj1.increment();
        System.out.println("After Incrementing : "+obj2.i);
    }
}
