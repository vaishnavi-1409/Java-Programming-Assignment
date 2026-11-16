public class ConvertDays {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter total number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println("Years = " + years);
        System.out.println("Weeks = " + weeks);
        System.out.println("Remaining days = " + days);
        sc.close();
    }
}
