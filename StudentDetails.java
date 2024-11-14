import java.util.Scanner;

class Student {
    String usn;
    String name;
    int marks1, marks2, marks3;

    // Method to read student data
    void readData(Scanner s) {
        System.out.print("Enter USN: ");
        usn = s.next();
        
        System.out.print("Enter Name: ");
        name = s.next();
        
        System.out.print("Enter Marks1: ");
        marks1 = s.nextInt();
        
        System.out.print("Enter Marks2: ");
        marks2 = s.nextInt();
        
        System.out.print("Enter Marks3: ");
        marks3 = s.nextInt();
    }

    // Method to display student data
    void displayData() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("CIE (Total Marks): " + computeCIE());
    }

    // Method to compute CIE (Continuous Internal Evaluation)
    int computeCIE() {
        return marks1 + marks2 + marks3;  // Sum of all three marks
    }
}

public class StudentDetails {
    public static void main(String[] args) 
    {
        // Create an array to store 10 students
        Student[] stu = new Student[10];
        Scanner s = new Scanner(System.in);

        // Read data for 10 students
        for (int i = 0; i < 10; i++) 
        {
            stu[i] = new Student();  // Create a new Student object
            System.out.println("Enter details for student " + (i + 1) + ":");
            stu[i].readData(s);  // Call readData() method to input student details
        }

        // Display data for 10 students
        System.out.println("Student details:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Details of Student " + (i + 1) + ":");
            stu[i].displayData();  // Call displayData() method to print student details
        }

        // Close the scanner to prevent resource leaks
        s.close();
    }
}
