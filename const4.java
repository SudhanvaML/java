class Person3
{
    int i;
    int j;
    int k;
}
class const4
{
    public static void main(String[] args)
    {
        Person3 p1=new Person3();
        Person3 p2=new Person3();
        Person3 p3=p2;
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}