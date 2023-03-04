package org.question4;

import static java.util.Locale.*;
import java.util.Locale;

public class MemoryEater {
    public static void main(String[] args){
        if(Locale.getDefault().getLanguage().equals("ja")){
            System.out.println("メモリを消費しています");
        }else{
            System.out.println("eatimg-memory");
        }

        long[] larray = new long[1280000];
        for (int i = 0; i<larray.length;i++){
            larray[i] = i;
        }
    }
}
