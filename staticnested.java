class StaticRestrictions {
    
    static int staticVariable = 10;
    int instanceVariable = 20; 

    static class NestedStaticClass 
    {
        static void display() {
            System.out.println("Inside Static Nested Class");
            System.out.println(staticVariable);
        }
    }
}
public class staticnested
{
    public static void main(String[] args)
    {
        StaticRestrictions.NestedStaticClass.display();
    }
}
