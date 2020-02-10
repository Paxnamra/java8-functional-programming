package _2_9_behaviour_parametrization_with_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a code for filtering the accounts list in two ways:
 * get list with all non-empty accounts (balance > 0) and save it to the variable nonEmptyAccounts
 * get all non-locked accounts with too much money (balance >= 100 000 000) and save it to the variable accountsWithTooMuchMoney
 */

public class Step1 {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>(Arrays.asList(
                new Account("1234567", 100000000L, false),
                new Account("4433221", 100000000L, true),
                new Account("9876521", 2000L, false),
                new Account("5433210", 2300L, false)
        ));

        Account account = new Account();

        List<Account> nonEmptyAccounts = account.filter(accounts, account.nonEmptyAccounts());
        List<Account> accountsWithTooMuchMoney = account.filter(accounts, account.accountsWithTooMuchMoney());

        System.out.println(nonEmptyAccounts);
        System.out.println(accountsWithTooMuchMoney);
    }
}
