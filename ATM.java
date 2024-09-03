import java.util.Scanner;

class ATM {
    private double balance = 2000;
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("\nATM MENU:");
            System.out.println("1. WITHDRAW");
            System.out.println("2. DEPOSIT");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4. EXIT");
            System.out.print("CHOOSE AN OPTION : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ENTER AMOUNT TO WITHDROW: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (balance >= withdrawAmount) {
                        balance -= withdrawAmount;
                        System.out.println("WITHDRAWAL SUCCESSFUL.");
                    } else {
                        System.out.println("INSUFFICIENT BALANCE.");
                    }
                    break;
                case 2:
                    System.out.print("ENTER AMOUNT TO DEPOSIT: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("DEPOSIT SUCCESSFUL.");
                    break;
                case 3:
                    System.out.println("CURRENT BALANCE: " + balance);
                    break;
                case 4:
                    System.out.println("EXITING ATM.");
                    return;
                default:
                    System.out.println("INVALID OPTION. PLEASE CHOOSE AGAIN.");
            }
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
    }
}
