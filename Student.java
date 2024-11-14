class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String Name, int Age) {
        name = Name;
        age = Age;
    }

    // Copy constructor
    Student(Student stu1) {
        this.name = anotherStudent.name;
        this.age = anotherStudent.age;
        System.out.println("Copy Constructor Called");
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Bob", 22); // Parameterized constructor is called
        Student s2 = new Student(s1);        // Copy constructor is called
        s1.display();
        s2.display();
    }
}
