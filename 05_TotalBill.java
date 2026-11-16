public class TotalBill {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.printf("Total bill = %.2f%n", price * quantity);
        sc.close();
    }
}
