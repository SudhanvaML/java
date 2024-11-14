class Box {
    int width, height, depth;
    
    // Default constructor
    Box() {
        width = height = depth = 0;
    }
    
    // Parameterized constructor
    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }
    
    // Method to calculate volume
    int volume() {
        return width * height * depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();  // Default constructor
        Box b2 = new Box(10, 20, 30);  // Parameterized constructor
        
        System.out.println("Volume of box1: " + b1.volume());
        System.out.println("Volume of box2: " + b2.volume());
    }
}
