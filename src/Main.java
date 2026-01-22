import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Account> account = new HashMap<>();
        account.put(1, new Account(123456789101L, "Vishva", 20000));
        account.put(2, new Account(981242415231L, "Mark", 30000));
        account.put(3, new Account(827382638161L, "Rich", 60000));
        account.put(4, new Account(229394713729L, "John", 80000));
        account.put(5, new Account(534312455254L, "Varun", 30000));
        account.put(6, new Account(882893486169L, "Sam", 40000));

        long depositAccount = 882893486169L;
        account.entrySet().stream().filter(a -> a.getValue().accountNo == depositAccount).forEach(a -> a.getValue().deposit(20000));
        System.out.println("afterDeposit" + account);

        long withdrawAcc = 882893486169L;
        long targetAcc = 123456789101L;
        account.entrySet().stream().filter(a -> a.getValue().accountNo == withdrawAcc).forEach(s -> {account.entrySet().stream().filter(a -> a.getValue().accountNo == targetAcc).forEach(t -> {
            AccountHelper accountHelper = new AccountHelper();
            accountHelper.transferMoney(s.getValue(), t.getValue(), 20000);
            });
        });
        System.out.println("afterTransfer" + account);

        account.values().forEach(System.out::println);

        System.out.println("Balance greater than 50k");
        account.values().stream()
                .filter(a -> a.getBalance() > 50000)
                .forEach(System.out::println);
    }
}
