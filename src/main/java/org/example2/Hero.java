package org.example2;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Hero implements Cloneable{
    private String name;
    private int hp,mp;

    private Sword sword;

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

    public void setSword(Sword sword) {
        this.sword = sword;
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

    //equalsメソッドのオーバーライド
    @Override
    public boolean equals(Object obj) {
        if(obj == this){return true;}
        if(obj == null){return false;}
        if(!(obj instanceof Hero)){return false;}
        Hero hh = (Hero)obj;
        if(!this.name.equals(hh.name)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,this.hp,this.mp);
    }

    //✖️複製の処理のオーバーライド
    //　複製の処理の実装
    public Hero clone(){
        Hero result = new Hero();
        result.name = this.getName();
        result.hp = this.getHp();
        result.mp = this.getMp();
        result.sword = this.sword.clone();

        return result;
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
