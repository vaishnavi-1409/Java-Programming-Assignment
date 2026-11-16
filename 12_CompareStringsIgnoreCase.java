public class CompareStringsIgnoreCase {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = sc.nextLine();
        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        if (first.equalsIgnoreCase(second))
            System.out.println("Strings are equal.");
        else
            System.out.println("Strings are not equal.");
        sc.close();
    }
}
