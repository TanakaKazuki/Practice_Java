package org.question1;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book x,Book y){
        return  x.getTitle().compareTo(y.getTitle());
    }

}
