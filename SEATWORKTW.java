import java.util.Scanner;

public class SEATWORKTWEV
    public static void checkBalance(int[] balances, int accountNumber) {
            System.out.println("Your current balance is: " + balances[accountNumber]);
         }
    public static void deposit(int[] balances, int accountNumber, int amount) {
            if (amount <= 0) {
        
            System.out.println("Invalid deposit amount. Please try again.");
            return;
         }
            
 balances[accountNumber] += amount;
        System.out.println("Deposit successful! New balance: " + balances[accountNumber]);
         }
    public static void withdraw(int[] balances, int accountNumber, int amount) {
            if (amount <= 0) {
        System.out.println("Invalid withdrawal amount. Please try again.");
            return;
         }
            if (amount > balances[accountNumber]) {
        System.out.println("Insufficient funds! Transaction cancelled.");
            return;
         }
        balances[accountNumber] -= amount;
        System.out.println("Withdrawal successful! New balance: " + balances[accountNumber]);
         }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] balances = {10000, 20000, 30000, 5, 1}; I 

        System.out.println("=== Welcome to Simple Banking System ===");
        System.out.print("Enter account number (0 to " + (balances.length - 1) + "): ");
        int accountNumber = scanner.nextInt();
        if (accountNumber < 0 || accountNumber >= balances.length) {
        System.out.println("Account number " + accountNumber + " does not exist! Exiting...");
        return;
         }
        while (true) {
        System.out.println("\n --- Menu ---");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        int optionChoice = scanner.nextInt();
        
        switch (optionChoice) {
                case 1:
                checkBalance(balances, accountNumber);
                break;
                case 2:
                System.out.print("Enter deposit amount: ");
                int depositAmount = scanner.nextInt();
                deposit(balances, accountNumber, depositAmount);
                break;
                case 3:
                System.out.print("Enter withdrawal amount: ");
                int withdrawAmount = scanner.nextInt();
                withdraw(balances, accountNumber, withdrawAmount);
                break;
         }
                if (optionChoice == 4) {
                System.out.println("Exiting program...");
                break;
             }
          }
              }
             }
