package _2_9_behaviour_parametrization_with_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Step1 {
    public static void main(String[] args) {

        List<Account> inDat = new ArrayList<>(Arrays.asList(
                new Account("1234567", 100000000L, false),
                new Account("4433221", 100000000L, true),
                new Account("9876521", 2000L, false),
                new Account("5433210", 2300L, false)
        ));

        Account a1 = new Account();

        List<Account> nonEmptyAccounts = a1.filter(inDat, a1.nonEmptyAccounts());
        List<Account> accountsWithTooMuchMoney = a1.filter(inDat, a1.accountsWithTooMuchMoney());

        System.out.println(nonEmptyAccounts);
        System.out.println(accountsWithTooMuchMoney);
    }
}
