package org.example3;

//ジェネリクスを使用した例
public class Pocket <E>{
    private E data;
    public void put(E d){this.data = d;}
    public E get(){return this.data;}
}
