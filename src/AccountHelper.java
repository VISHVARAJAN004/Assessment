public class AccountHelper {

    double balance = 0;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException();
        }
        balance -= amount;
    }

    public void transferMoney(Account sourceAcc, Account targetAcc, double amount) {
        sourceAcc.deposit(-amount);
        targetAcc.deposit(amount);
    }
}
