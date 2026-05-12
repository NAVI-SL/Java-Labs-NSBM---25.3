public class BankAccount {

    int accountNo;
    String holderName;
    double balance;

    public BankAccount() {
        accountNo = 1001;
        holderName = "Unknown";
        balance = 0.00;
    }

    public BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Updated balance: " + balance);
    }

    public String withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return "Withdrawal successful. Remaining balance: " + balance;
        } else {
            return "Insufficient funds.";
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountInfo(String branch) {
        return "Account No: " + accountNo +
               ", Holder Name: " + holderName +
               ", Branch: " + branch;
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount(2002, "Kamal Perera", 50000.00);

        System.out.println("Account 1 Information:");
        System.out.println(account1.getAccountInfo("Colombo"));
        account1.deposit(10000.00);
        System.out.println(account1.withdraw(5000.00));
        System.out.println("Current Balance: " + account1.getBalance());

        System.out.println();

        System.out.println("Account 2 Information:");
        System.out.println(account2.getAccountInfo("Kandy"));
        account2.deposit(15000.00);
        System.out.println(account2.withdraw(20000.00));
        System.out.println("Current Balance: " + account2.getBalance());
    }
}

