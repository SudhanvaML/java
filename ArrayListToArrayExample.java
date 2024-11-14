import java.util.ArrayList;

public class ArrayListToArrayExample {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("Date");

        // Convert ArrayList to Array
        String[] a = new String[al.size()]; // Create an array of the same size
        a = al.toArray(a); // Use toArray() method to convert

        // Print the elements of the array
        System.out.println("Array elements:");
        for (String i : a) {
            System.out.println(i);
        }
    }
}
