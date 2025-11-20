// a) Build a small menu-driven app using ArrayList to manage a BankAccount (accNo, holder, balance). Implement deposit/withdraw (validate non-negative), search by accNo, and print all accounts sorted by balance. (10 Marks)

import java.util.*;

class BankAccount {
    final private int accNo;
    final private String holder;
    private double balance;

    public BankAccount(int accNo, String holder, double balance) {
        this.accNo = accNo;
        this.holder = holder;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited successfully.");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or Insufficient balance!");
        }
    }

    public String toString() {
        return accNo + " - " + holder + " - " + balance;
    }
}

public class Q07 {

    public static BankAccount search(ArrayList<BankAccount> list, int accNo) {
        for (BankAccount b : list) {
            if (b.getAccNo() == accNo) {
                return b;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Add Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Search Account");
            System.out.println("5. Print All (sorted by balance)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Acc No: ");
                    int no = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Balance: ");
                    double bal = sc.nextDouble();
                    accounts.add(new BankAccount(no, name, bal));
                    System.out.println("Account added!");
                    break;

                case 2:
                    System.out.print("Enter Account No: ");
                    int acc1 = sc.nextInt();
                    BankAccount b1 = search(accounts, acc1);
                    if (b1 != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amt = sc.nextDouble();
                        b1.deposit(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account No: ");
                    int acc2 = sc.nextInt();
                    BankAccount b2 = search(accounts, acc2);
                    if (b2 != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amt = sc.nextDouble();
                        b2.withdraw(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account No to search: ");
                    int acc3 = sc.nextInt();
                    BankAccount b3 = search(accounts, acc3);
                    if (b3 != null)
                        System.out.println(b3);
                    else
                        System.out.println("Account not found!");
                    break;

                case 5:
                    accounts.sort(Comparator.comparingDouble(BankAccount::getBalance));
                    System.out.println("\n--- ACCOUNTS LIST ---");
                    for (BankAccount b : accounts) {
                        System.out.println(b);
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}