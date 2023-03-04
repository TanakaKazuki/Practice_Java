package org.example6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fw = null;

        try{
            fw = new FileWriter("sample.txt",true);
            fw.write('A');
            fw.flush();

//            FileReader fr = new FileReader("sample.txt");
//            System.out.println("全てのデータを読んで表示します");
//            int i = fr.read();
//            while(i != -1){
//                char c = (char)i;
//                System.out.println(c);
//                i = fr.read();
//            }
//            System.out.println("ファイルの末尾に到達しました");

        }catch (IOException ioe){
            System.out.println(ioe.getMessage());

        }finally {
            if(fw!=null){
                try {
                    fw.close();
                }catch (IOException ex2){

                }

            }

//            fr.close();
        }

    }
}
