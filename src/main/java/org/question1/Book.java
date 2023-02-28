package org.question1;

import java.util.Date;
import java.util.Objects;


public class Book implements Comparable<Book>,Cloneable{
    private String title;
    private Date publishDate;
    private String comment;

    //setterは、省略
    public String getTitle(){
        return this.title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getComment(){
        return this.comment;
    }

    //自然順序を日付順にする
    public int compareTo(Book obj){
        if(this.publishDate.before(obj.publishDate)){
            return -1;
        } else if (this.publishDate.after(obj.publishDate)) {
            return 1;
        }
        return 0;
    }

    //equalsメソッドのオーバーライド
    @Override
    public boolean equals(Object obj) {
        if(obj == this){return true;}
        if(obj == null){return false;}
        if(!(obj instanceof Book)){return false;}
        Book bb = (Book)obj;
        if(!this.title.equals(bb.title) || !this.publishDate.equals(bb.publishDate)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title,this.publishDate,this.comment);
    }

    public Book clone(){
        Book result = new Book();
        result.title = this.title;
        result.publishDate = (Date) this.publishDate.clone();
        result.comment = this.comment;

        return  result;
    }

    @Override
    public String toString() {
        return "タイトル："+this.title+"、発行日："+this.publishDate+"、コメント："+this.comment;
    }

    //コンストラクタ
    public Book(){
        this.title = "ノータイトル";
        this.publishDate = new Date();
        this.comment = "無し";
    }
    public Book(String title,Date publishDate,String comment){
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }


}
