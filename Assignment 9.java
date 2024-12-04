class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;
    double dailyWithdrawalLimit;
    double totalWithdrawnToday;
    public BankAccount(String accountHolderName, String accountNumber, double initialDeposit, double dailyLimit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.dailyWithdrawalLimit = dailyLimit;
        this.totalWithdrawnToday = 0.0;  
}
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount should be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount should be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else if (totalWithdrawnToday + amount > dailyWithdrawalLimit) {
            System.out.println("Exceeds daily withdrawal limit.");
        } else {
            balance -= amount;
            totalWithdrawnToday += amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public double checkBalance() {
        return balance;
    }
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Daily Withdrawal Limit: " + dailyWithdrawalLimit);
        System.out.println("Total Withdrawn Today: " + totalWithdrawnToday);
    }
    public void resetDailyLimit() {
        totalWithdrawnToday = 0;
        System.out.println("Daily withdrawal limit has been reset.");
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Pratik Girkar", "ABC123", 1000.0, 500.0);
        account.displayAccountInfo();
        account.deposit(200.0);  
        account.displayAccountInfo();
        account.withdraw(300.0);  
        account.displayAccountInfo();
        account.withdraw(300.0);  
        account.displayAccountInfo();
        System.out.println("Balance: " + account.checkBalance());
        account.resetDailyLimit();
        account.displayAccountInfo();
    }
}
