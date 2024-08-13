import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("9956030897", "995600", 10000.0);

        System.out.print("Enter PIN: ");
        String inputPin = scanner.nextLine();

        if (account.validatePin(inputPin)) {
            System.out.println("Welcome to the ATM!");
            boolean exit = false;

            while (!exit) {
                System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: " + account.getATM().getBalance());
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.getATM().deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdraw amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.getATM().withdraw(withdrawAmount);
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid PIN. Access denied.");
        }

        scanner.close();
    }
}
