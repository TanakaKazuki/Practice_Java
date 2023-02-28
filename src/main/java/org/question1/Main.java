package org.question1;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args){

        SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");

        Book book1 = new Book("Java入門",new Date(2011,10,07),"スッキリわかる");
        Book book2 = new Book("Python入門",new Date(2019,06,11),"カレーが食べたくなる");
        Book book3 = new Book("C言語入門",new Date(2018,06,21),"ポインタも自由自在");

        List<Book> list_book=  new ArrayList<>();
        list_book.add(book1);
        list_book.add(book2);
        list_book.add(book3);

        //System.out.println(list_book.get(0).equals(list_book.get(1)));
        System.out.println(list_book.get(0));
        System.out.println(list_book.get(1));
        System.out.println(list_book.get(2));

        Collections.sort(list_book);
        for(Book b: list_book){
            //System.out.println(b);
            System.out.println(b.getTitle()+" "
            +f.format(b.getPublishDate())
            +b.getComment());
        }


        Collections.sort(list_book,new TitleComparator());
        for(Book b: list_book){
            //System.out.println(b);
            System.out.println(b.getTitle()+" "
                    +f.format(b.getPublishDate())
                    +b.getComment());
        }


    }
}
