package com.kuranado.initializetest;

/**
 * Created by JING on 2017/10/29.
 */
public class InitializeTest2 {

    public static void main(String[] args) {
        new InitializeTest2();
    }

    public static InitializeTest2 b1 = new InitializeTest2();
    public static InitializeTest2 b2 = new InitializeTest2();

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态块");
    }
}
/*
执行顺序为：静态块>构造块>main>构造方法
所以依次执行：12->15->13->15->19->8->15
* */
