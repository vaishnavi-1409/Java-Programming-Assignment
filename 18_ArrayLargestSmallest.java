public class ArrayLargestSmallest {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a number greater than zero.");
        } else {
            int[] numbers = new int[n];
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }

            int largest = numbers[0];
            int smallest = numbers[0];
            for (int i = 1; i < n; i++) {
                if (numbers[i] > largest) largest = numbers[i];
                if (numbers[i] < smallest) smallest = numbers[i];
            }

            System.out.println("Largest = " + largest);
            System.out.println("Smallest = " + smallest);
        }
        sc.close();
    }
}
