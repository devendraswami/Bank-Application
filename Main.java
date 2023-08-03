import java.util.Scanner;

class Bank { 

    // Encapsulation Property is used here 

    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void welcomeMsg() {
        System.out.println("Hello! Welcome to our Bank");
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Your amount has been deposited successfully. Your new balance is: $" + balance);
        } else {
            System.out.println("You cannot deposit a negative or zero amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("You cannot withdraw a negative or zero amount.");
        } else if (amount > balance) {
            System.out.println("You do not have enough balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Your amount has been withdrawn successfully. Your new balance is: $" + balance);
        }
    }
}
 

// OOPs  concept inheritance is used here
class SBI extends Bank {
    public SBI(double balance) {
        super(balance);
    }
    

    // OOps concept PolyMorphism used here (Run time polyMorphism )
    @Override
    public void welcomeMsg() {
        System.out.println("Hello! Welcome to SBI Bank");
    }
}

class Main {
    public static void main(String[] args) {
        SBI bank = new SBI(0);
        bank.welcomeMsg();

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("What would you like to do?");
            System.out.println("1) Check Balance");
            System.out.println("2) Withdraw Cash");
            System.out.println("3) Deposit");
            System.out.println("4) Exit App");

            int choice = scan.nextInt();
            double amount;

            switch (choice) {
                case 1:
                    System.out.println("Your bank balance is: $" + bank.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw:");
                    amount = scan.nextDouble();
                    bank.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount you want to deposit:");
                    amount = scan.nextDouble();
                    bank.deposit(amount);
                    break;
                case 4:
                    System.out.println("Thank you for visiting our Bank Application");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid option between 1-4");
            }

        } while (true);
    }
}
