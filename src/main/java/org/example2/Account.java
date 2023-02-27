package org.example2;

public class Account implements Comparable<Account>{
    private int number;
    private int balance; //残高

    public int getBalance(){
        return this.balance;
    }
    public int getNumber(){
        return this.number;
    }

    //抽象メソッドのオーバーライド
    public int compareTo(Account obj){
        if (this.number < obj.number){
            return -1;
        }
        if(this.number > obj.number){
            return 1;
        }
        return 0;
    }

    public String toString(){
        return "Account:number="+this.number+",balance="+this.balance;
    }

    //コンストラクタ
    public Account(){
        this.number = 123;
        this.balance = 100000;
    }
    public Account(int number,int balance){
        this.number = number;
        this.balance = balance;
    }
}
