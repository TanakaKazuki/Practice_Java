package org.example3;

import static org.example3.AccountType.TEIKI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.*;

public class Main {
    //文字列sを文字cをで挟んで装飾するメソッド
    //文字列sがnullまたは長さ０の場合は、nullを返す
    //戻り値は、「nullの可能性があること」を明示するために、
    //単なるStringではなくOptional<String>とする。
    public static Optional<String> decorate(String st, char c){
        String r;
        if (st == null || st.length() == 0){
            r = null;
        }else{
            r = c + st + c;
        }

        return Optional.ofNullable(r);
    }
    public static void main(String[] args){
        Pocket<String> p = new Pocket<>();
        p.put("123");
        String s = p.get();
        System.out.println(s);

        Account account1 = new Account("123",AccountType.FUTSU);
        Account account2 = new Account("124",TEIKI);

        Outer.Inner ic  = new Outer.Inner();
        Outer o = new Outer();

        ic.innerMethod();
        o.outerMethod();

        ArrayList<Account> list = new ArrayList<>();
        Account account3 = new Account();
        Account account4 = new Account("12", TEIKI);

        list.add(account3);
        list.add(account4);


        Collections.sort(list, new Comparator<Account>() {
            @Override
            public int compare(Account o1,Account o2) {
                return (o1.getBalance() - o2.getBalance());
            }
        });

        Optional<String> sss = decorate("",'*');
        System.out.println(sss.orElse("nullのため処理できません"));



    }
}
