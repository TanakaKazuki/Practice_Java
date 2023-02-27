package org.example2;

import java.util.Map;
import java.util.TreeMap;

public class Hero {
    private String name;
    private int hp,mp;

    //name,hp,mpのgetter,setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setParameter(int hp,int mp){
        this.hp = hp;
        this.mp = mp;
    }
    public Map<String,Integer> getParameter(){

        Map<String,Integer> parameter = new TreeMap<>();
        parameter.put("hp",this.hp);
        parameter.put("mp",this.mp);

        return parameter;
    }
    public void setHp(){
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }
    public void setMp(){
        this.mp =mp;
    }
    public int getMp(){
        return this.mp;
    }

    //toStringメソッドのオーバーライド
    public String toString(){
        return "Hero（名前=" +this.name+
                "HP="+this.hp+"MP="+this.mp+")";
    }

    //コンストラクタ
    public Hero(String name,int hp,int mp){
        setName(name);
        setParameter(hp,mp);
    }

    //defaultコンストラクタ
    public Hero(){
        setName("None");
        setParameter(0,0);
    }
}
