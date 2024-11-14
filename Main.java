//Constructor Overloading
class Student
{
    int USN;
    String Name;

    Student()
    {
        USN=108;
        Name="Sudu";
    }

    Student(int USN)
    {
        this.USN = USN;
        //Name = "Sudhanva";
    }

    Student(int USN, String Name)
    {
        this.USN = USN;
        this.Name = Name;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        System.out.println("USN is: "+s1.USN);
        System.out.println("Name is: "+s1.Name);

        Student s2=new Student(46);
        System.out.println("USN is: "+s2.USN);
        System.out.println("Name is: "+s2.Name);

        Student s3=new Student(47,"Subbu");
        System.out.println("USN is: "+s3.USN);
        System.out.println("Name is: "+s3.Name);

    }
}
//Constructor Overloading
// class Student
// {
//     int USN;
//     String Name;
//     Student(int USN, String Name)
//     {
//         this.USN = USN;
//         this.Name = Name;
//     }
//     void display()
//     {
//         System.out.println(USN + " "+Name);
//     }
// }
// class Main
// {
//     public static void main(String[] args)
//     {

//         Student s3=new Student(47,"Subbu");
//         s3.display();

//     }
// }
