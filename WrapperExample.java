import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {

        // Using wrapper classes in a collection
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);  // Autoboxing
        intList.add(20);
        intList.add(30);

        // Iterating through the list
        System.out.println("List of Integers:");
        for (Integer num : intList) {
            System.out.println(num); // Unboxing happens here
        }
    }
}