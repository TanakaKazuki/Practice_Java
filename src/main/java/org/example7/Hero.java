package org.example7;

import java.io.Serializable;

public class Hero implements Serializable {
    private String name;
    private int hp;
    private int mp;

    private Sword sword;

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMp(int mp){
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }
    Hero(){
        this.name = "名無し";
        this.hp = 0;
        this.mp = 0;
    }
    Hero(String name,int hp,int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
}
