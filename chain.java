//Constructor Chaining
class Stu
{
    int USN;
    String Name;

    Stu(int USN, String Name)
    {
        this(USN);
        this.Name = Name;
    }
    Stu(int USN)
    {
        this.USN = USN;
    }

}
class chain
{
    public static void main(String[] args)
    {
        Stu st1 = new Stu(10,"Sudu");
        System.out.println("USN is "+st1.USN);
        System.out.println("Name is "+st1.Name);
    }
}
