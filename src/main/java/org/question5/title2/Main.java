package org.question5.title2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main {
    static void main(String[] args){
        if (args.length !=2){
            System.out.println("引数の数が足りません");
            return;
        }
        String input_file = "/Users/kazuki/Desktop/Study_Java/Practice_Java/"+args[0];
        String output_file = "/Users/kazuki/Desktop/Study_Java/Practice_Java/"+args[1];

        try(
                FileInputStream fis = new FileInputStream(input_file);
                FileOutputStream fos = new FileOutputStream(output_file);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                GZIPOutputStream gos = new GZIPOutputStream(bos);
                ){
            int i = fis.read();
            while (i != -1){
                gos.write(i);
                i = fis.read();
            }
            gos.flush();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
