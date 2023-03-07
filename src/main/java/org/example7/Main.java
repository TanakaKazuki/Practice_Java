package org.example7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("/Users/kazuki/Desktop/Study_Java/Practice_Java/rpgdata.properties");
        Properties p = new Properties();
        p.load(fr);
        String name = p.getProperty("heroName");
        String strHp = p.getProperty("heroHp");

        System.out.println(name);
        System.out.println(strHp);

        int hp = Integer.parseInt(strHp);
        System.out.println("勇者の名前"+ name);
        System.out.println("勇者のHP:"+hp);

        fr.close();

        Writer fw = new FileWriter("/Users/kazuki/Desktop/Study_Java/Practice_Java/rpgdata.properties");
        p.setProperty("heroName","asaka");
        p.setProperty("heroHp","22");
        p.setProperty("heroMp","10");
        p.store(fw,"勇者の情報");
        fw.close();

        System.out.println(System.getProperty("java.class.path"));
        ResourceBundle rb = ResourceBundle.getBundle(
                "org.example7.rpgdata");
        String heroName = rb.getString("heroName");
        System.out.println("勇者の名前"+heroName);

        Hero h1 = new Hero();
        FileOutputStream fos = new FileOutputStream("rpgsave.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(h1);
        oos.close();

        FileInputStream fis = new FileInputStream("rpgsave.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Hero h2 = (Hero) ois.readObject();
        ois.close();

        System.out.println(h2.getName());

    }
}
