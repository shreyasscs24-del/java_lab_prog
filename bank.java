import java.util.Scanner;

class Account {
    protected String customerName;
    protected String accountNumber;
    protected String accountType;
    protected double balance;

    public Account(String customerName, String accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: Rs. " + balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

class SavAcct extends Account {
    private double interestRate;

    public SavAcct(String customerName, String accountNumber, double balance, double interestRate) {
        super(customerName, accountNumber, "Savings", balance);
        this.interestRate = interestRate;
    }

    public void computeInterest(int years) {
        double interest = balance * Math.pow((1 + interestRate / 100), years) - balance;
        balance += interest;
        System.out.println("Interest of Rs. " + String.format("%.2f", interest) + " added to account.");
    }
}

class CurAcct extends Account {
    private static final double MIN_BALANCE = 1000.0;
    private static final double SERVICE_CHARGE = 100.0;

    public CurAcct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: Rs. " + amount);
            checkMinBalance();
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    private void checkMinBalance() {
        if (balance < MIN_BALANCE) {
            balance -= SERVICE_CHARGE;
            System.out.println("Minimum balance not maintained! Service charge of Rs. " + SERVICE_CHARGE + " imposed.");
        }
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String name = sc.nextLine();

        System.out.println("Enter account number:");
        String accNo = sc.nextLine();

        System.out.println("Enter account type (Savings/Current):");
        String type = sc.nextLine().toLowerCase();

        Account acc = null;

        if (type.equals("savings")) {
            acc = new SavAcct(name, accNo, 0.0, 5.0);
        } else if (type.equals("current")) {
            acc = new CurAcct(name, accNo, 0.0);
        } else {
            System.out.println("Invalid account type!");
            System.exit(0);
        }

        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            if (acc instanceof SavAcct)
                System.out.println("4. Compute Interest");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    acc.withdraw(wit);
                    break;
                case 3:
                    acc.displayBalance();
                    break;
                case 4:
                    if (acc instanceof SavAcct) {
                        System.out.print("Enter number of years: ");
                        int years = sc.nextInt();
                        ((SavAcct) acc).computeInterest(years);
                    } else {
                        System.out.println("Interest computation not available for current account.");
                    }
                    break;
                case 0:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}