//Objects as Parameter
class Test
{
    int a;
    Test (int a)
    {
        this.a = a;
    }
    Test(Test t)
    {
        this.a = t.a;
    }
    Boolean equalTo(Test o)
    {
        if((this.a == o.a))
            return true;
        else
            return false;
    }
    void method(Test t)
    {
        t.a *=2;
    }
}
class passobj
{
    public static void main(String[] args)
    {
        Test t1 = new Test(10);
        Test t2 = new Test(10);
        Test t3 = new Test(30);
        Test t4=new Test(t1);
        System.out.println(t1.equalTo(t2));
        System.out.println(t1.equalTo(t3));
        System.out.println(t1.equalTo(t4));
    }
}
