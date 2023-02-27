package org.example2;

public class Sword implements Cloneable{
    private String name;
    private int power;

    public Sword clone(){
        Sword result = new Sword();
        result.name = this.name;
        result.power = this.power;

        return result;
    }

    //コンストラクタ
    public Sword(){
        this.name = "木の棒";
        this.power = 2;
    }
    public Sword(String name,int power){
        this.name = name;
        this.power = power;
    }
}
