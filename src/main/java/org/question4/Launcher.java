package org.question4;


import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class Launcher {
    public static void main(String[] args){
        String fqcn = args[0];
        String fqcn2 = args[1];
        String sw = args[2];

        System.out.println(fqcn2);

        System.out.println(sw);
        //現在メモリに割り当てられたオブジェクトのメモリ使用量
        showMemory();

        try{
            Class<?> activate_class = Class.forName(fqcn);
            Class<?> activate_class2 = Class.forName(fqcn2);
            getMethodName(activate_class);

            if (sw.equals("E")){
                System.out.println("別プロセスで実行する");
                activate_another(activate_class);
                activate_another(activate_class2);


            }else if(sw.equals("I")){
                System.out.println("リフレクションでメインメソッドを実行する");
                activate_reflect(activate_class);
                activate_reflect(activate_class2);

            }else{
                throw new IllegalArgumentException("起動方法の指定が不正です");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }

        showMemory();
        System.exit(0);

    }

    private static void activate_reflect(Class<?> activate_class) throws Exception{
        Method activate_reflect = activate_class.getMethod("main",String[].class);
        String[] args = {};
        activate_reflect.invoke(null,(Object) args);

    }

    private static void activate_another(Class<?> activate_class) throws Exception{
        ProcessBuilder pb = new ProcessBuilder("java",activate_class.getName());
        Process ps = pb.start();
        ps.waitFor();
    }

    private static void getMethodName(Class<?> activate_class) {
        System.out.println("クラスが持つメソッドの一覧を示す");
        Method[] list_method = activate_class.getDeclaredMethods();
        for(Method m :list_method){
            System.out.println(m);
        }
        //System.out.println(activate_class.getDeclaredMethod());
    }

    private static void showMemory() {

        //System.out.println(Runtime.getRuntime().totalMemory());
        long free = Runtime.getRuntime().freeMemory();
        long total = Runtime.getRuntime().totalMemory();
        long usage = (total - free) / 1024 /1024;
        System.out.println("現在のメモリ使用量："+usage+"MB");
    }

}
