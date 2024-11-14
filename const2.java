class Person1
{
    String Name="Direct";
    int sem=3;
    void display()
    {
        System.out.println("Name = "+Name);
        System.out.println("Sem = "+sem);
    }
}
class const2
{
    public static void main(String[] args)
    {
        Person1 Sudu=new Person1();
        Sudu.display();
    }
}