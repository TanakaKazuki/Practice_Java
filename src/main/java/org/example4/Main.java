package org.example4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import org.example2.Account;
import org.example2.Hero;

public class Main {
    //引数を受け取り、文字数を返す関数
    public static Integer len(String s){
        return s.length();
    }





    //自作の関数インターフェースの実装
    @FunctionalInterface
    public interface PartyInfoConsumer{
        public abstract void process(Set<Hero>party,Hero leader,String pName);
    }

    public static void main(String[] args){
        //lenメソッドの処理ロジックを変数funcに代入する
        Function<String,Integer>func = Main::len;
        //変数funcに格納されている処理ロジックを、引数Javaで実行する
        int a = func.apply("Java");
//        int b = func.apply();
        System.out.println("文字列Javaは、文字数"+a+"です。");


        //ラムダ式
        Function<long[],long[]>func_copy =
                (long[] org)->{
                    long[] cpy = java.util.Arrays.copyOf(org, org.length);
                    java.util.Arrays.sort(cpy);
                    return cpy;
                };
        //コンパレータを使わず、リストの並べ替え方をラムダ式で指定
        List<Account>accountList = new ArrayList<>();
        Account account = new Account();
        Account account1 = new Account(123,10000);
        accountList.add(account);
        accountList.add(account1);
        Collections.sort(accountList,(x,y)->(x.getBalance() - y.getBalance()));


    }
}
