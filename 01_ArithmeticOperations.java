public class ArithmeticOperations {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        if (b != 0)
            System.out.println("Quotient = " + ((double) a / b));
        else
            System.out.println("Quotient is not possible because divisor is zero.");
        sc.close();
    }
}
