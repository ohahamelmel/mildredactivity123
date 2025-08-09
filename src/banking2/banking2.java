package banking2;

import java.util.Scanner;

public class banking2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("WELCOME TO MY SYSTEM!");
        System.out.println("What do you feel like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
         
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                BankApp[] bApp = new BankApp[10];
                int accountCount = 0; 
                int response;

                do {
                    System.out.println("1. Register Account");
                    System.out.println("2. Sign Account");
                    System.out.println("3. View All Accounts");
                    System.out.print("Enter Selection: ");
                    int action = sc.nextInt();

                    switch (action) {
                        case 1:
                            if (accountCount < bApp.length) {
                                bApp[accountCount] = new BankApp();
                                System.out.print("Enter Account No.: ");
                                bApp[accountCount].setAccNo(sc.nextInt());
                                System.out.print("Set Account Pin: ");
                                bApp[accountCount].setPin(sc.nextInt());
                                accountCount++; 
                                System.out.println("Account registered successfully!");
                            } else {
                                System.out.println("Maximum account limit reached.");
                            }
                            break;

                        case 2:
                            System.out.print("Enter Account No.: ");
                            int account = sc.nextInt();
                            System.out.print("Enter Pin No.: ");
                            int pin = sc.nextInt();

                            boolean loggedIn = false;
                            int attempt = 3;

                            for (int i = 0; i < accountCount; i++) {
                                if (bApp[i].verifyAccount(account, pin)) {
                                    loggedIn = true;
                                    System.out.println("LOGIN SUCCESS");
                                    accountOperations(sc, bApp[i]); 
                                }
                            }

                            if (!loggedIn) {
                                System.out.println("Invalid Account or PIN. Attempts left: " + (attempt - 1));
                                attempt--;
                                if (attempt == 0) {
                                    System.out.println("ATTEMPT LIMIT REACHED!");
                                }
                            }
                            break;

                        case 3:
                            System.out.println("--- Registered Accounts ---");
                            for (int i = 0; i < accountCount; i++) {
                                System.out.println("Account " + (i + 1) + ": " + bApp[i].getAccNo());
                            }
                            break;

                        default:
                            System.out.println("INVALID SELECTION!");
                    }

                    System.out.println("Continue? (1/0): ");
                    response = sc.nextInt();

                } while (response == 1);
                break;

            case 2:
                System.out.println("Shopping functionality not implemented yet.");
                break;

            case 3:
                System.out.println("Pay Bills functionality not implemented yet.");
                break;

            default:
                System.out.println("INVALID SELECTION!");
        }
        sc.close();
    }

    private static void accountOperations(Scanner sc, BankApp account) {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. View Account Info");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter Selection: ");
            int action = sc.nextInt();

            switch (action) {
                case 1:
                    System.out.println("Account No: " + account.getAccNo());
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    float depositAmount = sc.nextFloat();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    float withdrawAmount = sc.nextFloat();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("INVALID SELECTION!");
            }
        }
    }
}



    