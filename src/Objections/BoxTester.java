package Objections;

public class BoxTester {
    public static void main(String[] args) {
        Box box = new Box(5,5,5);
        System.out.println("Wysokość: " + box.getHeight());
        System.out.println("Szerokość: " + box.getWidth());
        System.out.println("Głębokość: " + box.getDepth());
    }
}
