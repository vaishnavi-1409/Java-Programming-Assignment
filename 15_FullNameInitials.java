public class FullNameInitials {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = sc.nextLine().trim();
        System.out.print("Enter last name: ");
        String last = sc.nextLine().trim();

        System.out.println("Full name = " + first + " " + last);
        if (!first.isEmpty() && !last.isEmpty()) {
            System.out.println("Initials = " +
                Character.toUpperCase(first.charAt(0)) + "." +
                Character.toUpperCase(last.charAt(0)) + ".");
        }
        sc.close();
    }
}
