package org.example3;

import static org.example3.AccountType.TEIKI;

public class Main {
    public static void main(String[] args){
        Pocket<String> p = new Pocket<>();
        p.put("123");
        String s = p.get();
        System.out.println(s);

        Account account1 = new Account("123",AccountType.FUTSU);
        Account account2 = new Account("124",TEIKI);
    }
}
