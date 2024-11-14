// Generic class Pair with two type parameters T and U
class Pair<T, U> 
{
    T first;  // First element of type T
    U second; // Second element of type U

    // Constructor to initialize the pair
    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Method to get the first element
    T getFirst() {
        return first;
    }

    // Method to get the second element
    U getSecond() {
        return second;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        // Creating a Pair object with Integer and String types
        Pair<Integer, String> p = new Pair<>(1, "One");
        System.out.println("First: " + p.getFirst() + ", Second: " + p.getSecond());
        
        // Creating another Pair object with String and Double types
        Pair<String, Double> p2 = new Pair<>("Pi", 3.14);
        System.out.println("First: " + p2.getFirst() + ", Second: " + p2.getSecond());
    }
}
