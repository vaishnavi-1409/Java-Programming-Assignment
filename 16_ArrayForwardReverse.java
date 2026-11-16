public class ArrayForwardReverse {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Same order: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nReverse order: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
