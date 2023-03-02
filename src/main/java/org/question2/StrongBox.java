package org.question2;

public class StrongBox<E> {
    private E item;
    private  KeyType keyType;

    private long count;

    public void setItem(E item){
        this.item = item;
    }
    public E getItem(){

        switch (this.keyType){
            case PADLOCK:
                count++;
                if (count >= 1024){
                    this.count = 0;
                    return this.item;
                }else {
                    return null;
                }

            case BUTTON:
                count++;
                if (count >= 10000){
                    this.count = 0;
                    return this.item;
                }else {
                    return null;
                }
            case DIAL:
                count++;
                if (count >= 30000){
                    this.count = 0;
                    return this.item;
                }else {
                    return null;
                }
            case FINGER:
                count++;
                if (count >= 1000000){
                    this.count = 0;
                    return this.item;
                }else {
                    return null;
                }
        }


        return this.item;
    }
    public KeyType getKeyType(){
        return this.keyType;
    }

    //コンストラクタ
    public StrongBox(){
        this.keyType = KeyType.BUTTON;
    }

    public StrongBox(KeyType keyType){
        this.keyType = keyType;
    }

}
