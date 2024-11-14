class Person
{
    String Name;
    int sem;
    void display()
    {
        System.out.println("Name = "+Name);
        System.out.println("Sem = "+sem);
    }
}
class const1
{
    public static void main(String[] args)
    {
        Person Sudu=new Person();
        Sudu.Name="Student";
        Sudu.sem=2;
        Sudu.display();
    }
}
