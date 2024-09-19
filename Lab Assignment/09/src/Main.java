
/*Create a class BankAccount with attributes such as account number and balance. Implement a
constructor to initialize these attributes and provide methods for deposit, withdrawal, and
checking the balance.
*/

class BankAccount {
    private int acNum;
    private double balance;

    public BankAccount(int acNum, double balance) {
        this.acNum = acNum;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Number: " + acNum + ", Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(122480, 500.00);

        account.checkBalance();
        account.deposit(7000.00);
        account.checkBalance();
        account.withdraw(5500.00);
        account.checkBalance();
    }
}