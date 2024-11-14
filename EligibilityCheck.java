
class NotEligibleException extends Exception 
{
    NotEligibleException(String message) 
    {
        super(message);
    }
}

class Student {
    String name;
    int Age;

    Student(String name, int Age) {
        this.name = name;
        this.Age = Age;
    }

    public void checkEligibility() throws NotEligibleException {
        if (Age < 18) 
        {
            throw new NotEligibleException(name + " is NOT ELIGIBLE for the final exam due to insufficient attendance.");
        } 
        else {
            System.out.println(name + " is eligible to appear for the final exam.");
        }
    }
}
public class EligibilityCheck {
    public static void main(String[] args) {

        Student s = new Student("John", 8);

        try {
            s.checkEligibility();
        } 
        catch (NotEligibleException e) 
        {
            System.out.println(e.getMessage());
        }
        catch (Throwable t) 
        {
            System.out.println("An unexpected error occurred: " + t.getMessage());
        }
    }
}
