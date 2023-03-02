package org.question3;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class Main {

    public static class FuncList{
        public static boolean isOdd(int x){return (x%2 == 1);}
        public static String passCheck(int point,String name){
            return name+"さんは"+(point > 65 ? "合格":"不合格");
        }
    }

    //メイン関数
    public static void main(String[] args){
        FuncList funcList = new FuncList();
        //インターフェースに関数を代入
        Func1 f1 = FuncList::isOdd;
        Func2 f2 = FuncList::passCheck;
        System.out.println(f1.call(15));
        System.out.println(f2.call(66,"Smith"));

        //ラムダ式
        Func1 f3 = (int x)->{return (x%2 == 1);};
        Func2 f4 = ((int point,String name)
                -> {return name+"さんは"+(point > 65 ? "合格":"不合格");});
        System.out.println(f1.call(17));
        System.out.println(f2.call(60,"Smith"));

        //適切な標準関数インターフェースを利用
        IntPredicate f5 = (int x)->{return x%2 == 1;};
        System.out.println(f5.test(21));

        List<String> names = new ArrayList<>();
        names.add("菅原拓真さん");
        names.add("湊雄輔");
        names.add("朝香あゆみ");

        names.stream().filter(h-> h.length()<=4).map(n-> n+"さん").forEach(System.out::println);
        System.out.println(names);

    }
}
