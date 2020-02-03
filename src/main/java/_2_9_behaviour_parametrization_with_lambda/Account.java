package _2_9_behaviour_parametrization_with_lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Account {
    private String number;
    private Long balance;
    private boolean isLocked;

    public String getNumber() {
        return number;
    }

    public Long getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public Account() {
    }

    public Account(String number, Long balance, boolean isLocked) {
        this.number = number;
        this.balance = balance;
        this.isLocked = isLocked;
    }

    public Predicate<Account> nonEmptyAccounts() {
        return account -> account.getBalance() > 0;
    }

    public Predicate<Account> accountsWithTooMuchMoney() {
        return account -> account.getBalance() >= 100_000_000L
                && !account.isLocked;
    }

    public List<Account> filter(List<Account> accList, Predicate<Account> f) {
        return accList.stream().filter(f).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", isLocked=" + isLocked +
                '}';
    }
}
