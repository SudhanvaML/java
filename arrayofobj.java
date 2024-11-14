//Array of objects
import java.util.Scanner;

class Stude1 {
    String USN;
    String Name;
    String Branch;
    Double result;

    void readInfo(int i) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the details of Student " +(i+1) );
        System.out.println("Enter Student USN: ");
        USN = s.next();
        System.out.println("Enter Student Name: ");
        Name = s.next();
        System.out.println("Enter Student Branch: ");
        Branch = s.next();
        System.out.println("Enter Student Result: ");
        result = s.nextDouble();
    }

    void printInfo(int i) {
        System.out.println("\nDetails of Student " + (i+1) +" is");
        System.out.println("Student USN: " + USN );
        System.out.println("Student Name: " + Name );
        System.out.println("Student Branch: " + Branch );
        System.out.println("Student Result: " + result );
    }
}

    class arrayofobj
    {
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            Stude1 st[] = new Stude1[10];
            System.out.println("Enter the number of students ");
            int n = s.nextInt();

            for (int i = 0; i < n; i++)
            {
                st[i] = new Stude1();
                st[i].readInfo(i);
            }
            for (int i = 0; i < n; i++)
            {
                st[i].printInfo(i);
            }
        }
    }


