class Person2
{
    String Name;
    int sem;
    Person2()
    {
        Name="Direct";
        sem=4;
    }
    void display()
    {
        System.out.println("Name = "+Name);
        System.out.println("Sem = "+sem);
    }
}
class const3
{
    public static void main(String[] args)
    {
        Person2 Sudu=new Person2();
        Sudu.display();
    }
}