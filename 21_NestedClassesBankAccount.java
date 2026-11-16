class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // Inner class: can read and change the private field of BankAccount.
    class AccountManager {
        void deposit(double amount) {
            if (amount > 0) {
                balance = balance + amount;
            }
        }

        void showBalance() {
            System.out.println("Balance = " + balance);
        }
    }

    // Static nested class: does not need a BankAccount object.
    static class ReceiptPrinter {
        void printReceipt() {
            System.out.println("Receipt: Thank you for banking with us.");
        }
    }

    interface Notifier {
        void sendMessage(String message);
    }

    void sendNotification(Notifier notifier) {
        notifier.sendMessage("Your bank account has been updated.");
    }
}

public class NestedClassesBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        BankAccount.AccountManager manager = account.new AccountManager();
        manager.deposit(500);
        manager.showBalance();

        BankAccount.ReceiptPrinter printer =
            new BankAccount.ReceiptPrinter();
        printer.printReceipt();

        BankAccount.Notifier notifier = new BankAccount.Notifier() {
            public void sendMessage(String message) {
                System.out.println("Notification: " + message);
            }
        };

        account.sendNotification(notifier);
    }
}
