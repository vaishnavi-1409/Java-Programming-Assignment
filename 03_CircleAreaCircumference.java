public class CircleAreaCircumference {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.println("Area = " + (Math.PI * radius * radius));
        System.out.println("Circumference = " + (2 * Math.PI * radius));
        sc.close();
    }
}
