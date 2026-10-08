public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Lashya",123456789, 10000);
        System.out.println("Account Holder: "+account.getAccountHolder());
        System.out.println("Account Number: "+account.getAccountNUmber());
        System.out.println("Initial Balance: "+account.getBalance());
        account.deposit(5000);
        account.withdraw(3000);
        System.out.println("Final Balance: "+account.getBalance());
    }
}
class BankAccount{
    private String accountHolder;
    private long accountNumber;
    private double balance;
    BankAccount(String accountHolder, long accountNumber,double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public long getAccountNUmber() {
        return accountNumber;

    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if(amount>0) {
            balance+=amount;
            System.out.println("Amount deposited: "+amount);
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if(amount>=0&& amount<=balance) {
            balance-=amount;
            System.out.println("Amount withdraw: "+amount);
        }
        else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }

}
