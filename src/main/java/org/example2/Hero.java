package org.example2;

public class Hero {
    private String name;
    private int hp,mp;

    //toStringメソッドのオーバーライド
    public String toString(){
        return "Hero（名前=" +this.name+
                "HP="+this.hp+"MP="+this.mp+")";
    }
}
