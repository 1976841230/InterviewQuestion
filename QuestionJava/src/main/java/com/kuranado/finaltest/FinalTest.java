package com.kuranado.finaltest;

/**
 * Created by JING on 2017/10/28.
 */
public class FinalTest {
    static final int x = 0; //final变量必须初始化一个值
    static int y;
    public static void main(String[] args) {
        System.out.println(++y + x);
    }
}
