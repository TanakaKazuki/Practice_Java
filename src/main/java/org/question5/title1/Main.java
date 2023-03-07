package org.question5.title1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = "/Users/kazuki/Desktop/Study_Java/Practice_Java/sample.txt";
        String s_output = "/Users/kazuki/Desktop/Study_Java/Practice_Java/sample_copy.txt";
        FileInputStream fis = new FileInputStream(s);
        FileOutputStream fos = new FileOutputStream(s_output);
        int is = fis.read();
        while (is != -1){
            fos.write(is);
            is =fis.read();
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
