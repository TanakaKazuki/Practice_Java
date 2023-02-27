package org.example2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Hero h = new Hero("Man",10,10);
        Sword sword = new Sword();
        System.out.println(h);
        List<Hero> list = new ArrayList<>();
        Hero h1 = new Hero("Master",20,20);
        Sword sword1 = new Sword();
        h1.setSword(sword1);
        list.add(h1);
        Hero h2 = new Hero("Thief",10,10);
        Sword sword2 = new Sword("剣",100);
        h1.setSword(sword2);
        list.add(h2);
        System.out.println(list.size());
        list.remove(h1);
        System.out.println(list.size());

        Hero h3 = h1.clone();
        list.add(h3);
        System.out.println(h3);

        List<Account> list_account = new ArrayList<>();
        Account account1 = new Account();
        Account account2 = new Account(111,1000);
        Account account3 = new Account(110,10000);
        list_account.add(account1);
        list_account.add(account2);
        list_account.add(account3);

        System.out.println(list_account);
        Collections.sort(list_account);

        System.out.println(list_account);

        Collections.sort(list_account,new BalanceComparator());
        System.out.println(list_account);

    }
}
