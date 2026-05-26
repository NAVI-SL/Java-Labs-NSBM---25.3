public class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance ) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public string getAccountNumber() {
        return accountNumber;
    }
}
