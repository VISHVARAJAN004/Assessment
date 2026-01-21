import java.util.Objects;
public class Account {
    final long accountNo;
    final String holderName;
    private double balance;

    public void deposit(double amount){
        balance+=amount;
    }

    public Account(long accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getAccountNo() {
        return accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(accountNo, account.accountNo) == 0 && Double.compare(balance, account.balance) == 0 && Objects.equals(holderName, account.holderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo, holderName, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
