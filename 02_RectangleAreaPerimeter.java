public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.println("Area = " + (length * breadth));
        System.out.println("Perimeter = " + (2 * (length + breadth)));
        sc.close();
    }
}
