public class ArraySumAverage {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a number greater than zero.");
        } else {
            int[] numbers = new int[n];
            int sum = 0;

            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
                sum += numbers[i];
            }

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + (double) sum / n);
        }
        sc.close();
    }
}
