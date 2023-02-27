package org.example2;

import java.util.Comparator;

public class BalanceComparator implements Comparator<Account> {
    public int compare(Account x,Account y){
        return (x.getBalance() - y.getBalance());
    }
}
