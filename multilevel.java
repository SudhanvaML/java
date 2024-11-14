class Stu
{
    String Name;
    Stu(String Name)
    {
        this.Name = Name;
    }
    void StuName()
    {
        System.out.println("Student Name: " + Name);
    }
}
class Age extends Stu
{
    int Age;
    Age(String Name, int Age)
    {
        super(Name);
        this.Age = Age;
    }
    void StuAge()
    {
        StuName();
        System.out.println("Student Age: " + Age);
    }
}
class id extends Age
{
    int ID;
    id(String Name, int Age, int ID)
    {
        super(Name, Age);
        this.ID = ID;
    }
    void StuID()
    {
        StuAge();
        System.out.println("Student ID: " + ID);
    }
}
public class multilevel 
{
    public static void main(String[] args)
    {
        id obj = new id("John", 18, 123);
        obj.StuID();
    }   
}
