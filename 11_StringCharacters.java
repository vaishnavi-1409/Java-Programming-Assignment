public class StringCharacters {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a string (at least 3 characters): ");
        String str = sc.nextLine();

        if (str.length() < 3) {
            System.out.println("Please enter at least 3 characters.");
        } else {
            System.out.println("First character = " + str.charAt(0));
            System.out.println("Last character = " + str.charAt(str.length() - 1));
            System.out.println("Character at position 3 = " + str.charAt(2));
        }
        sc.close();
    }
}
