class static1
{
    static int a=3;
    static int b;

    static void method(int x)
    {
        System.out.println("x = "+x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static
    {
        System.out.println("static block initialized");
        b=a*4;
    }
}
class useStatic
{
    public static void main(String[] args)
    {
        static1 us1 = new static1();
        static1 us2 = new static1();
        static1.method(40);
        System.out.println("a value using absolute qualifier : "+static1.a);
        System.out.println("a value at instance/ object level : "+us1.a);
        us2.a=6;
        System.out.println("b value using absolute qualifier : "+us1.a);
        System.out.println("b value at instance/ object level : "+us2.a);
    }
}
