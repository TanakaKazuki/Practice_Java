package org.example3;

public class Outer {
    int outerField;
    static int outerStaticField;

    static class Inner{
        void innerMethod(){
            outerStaticField = 10;
            //staticな外部クラスメンバではないため、不可
            //outerField = 2;
        }
    }
    void outerMethod(){
        Inner ic = new Inner();
    }
}
