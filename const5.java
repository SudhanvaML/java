class Person4
{
    String Name;
    int sem;
    Person4()
    {
        Name="Direct";
        sem=4;
    }
    Person4(String n,int s)
    {
        Name=n;
        sem=s;
    }
    void display()
    {
        System.out.println("Name = "+Name);
        System.out.println("Sem = "+sem);
    }
}
class const5
{
    public static void main(String[] args)
    {
        Person4 p1=new Person4();
        Person4 p2=new Person4("Hello",5);
        p1.display();
        p2.display();
    }
}