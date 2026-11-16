public class MarksTotalAverage {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter marks of three subjects: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        double total = m1 + m2 + m3;

        System.out.println("Total = " + total);
        System.out.printf("Average = %.2f%n", total / 3);
        sc.close();
    }
}
