package org.example5;

import java.util.Iterator;
import java.util.Properties;

public class Main {
    public static void main(String[] args){
        //JVMの終了
        boolean isErr = false;
        if (isErr){
            System.out.println("データが壊れています、異常終了します。");
            System.exit(1);

        }

        System.out.println("利用中のJavaバージョン");
        System.out.println(System.getProperty("java.version"));
        Properties p = System.getProperties();
        Iterator<String> i = p.stringPropertyNames().iterator();
        System.out.println("システムプロパティ一覧");
        while (i.hasNext()){
            String key = i.next();
            System.out.println(key+"=");
            System.out.println(System.getProperty(key));
        }


        System.out.println("正常終了しました");
    }
}
