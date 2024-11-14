//
class Student1
{
    int USN;
    String Name;
    Student1(int USN)
    {
        this.USN = USN;
    }
    Student1(int USN, String Name)
    {
        this.USN = USN;
        this.Name = Name;
    }
}
class Main1
{
    public static void main(String[] args)
    {
        Student1 s2=new Student1(46);
        System.out.println("USN is: "+s2.USN);
        System.out.println("Name is: "+s2.Name);

        Student1 s3=new Student1(47,"Subbu");
        System.out.println("USN is: "+s3.USN);
        System.out.println("Name is: "+s3.Name);

    }
}
