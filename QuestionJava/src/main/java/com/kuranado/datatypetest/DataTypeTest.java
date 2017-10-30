package com.kuranado.datatypetest;

/**
 * Created by JING on 2017/10/29.
 */
public class DataTypeTest {
    public static void main(String[] args) {
        byte a1 = 2, a2 = 4, a3;
        short s = 16;
        //a2 = s;   //此处需要进行强制类型转换
        //a3 = a1 * a2; //当一个算术表达式中包含多个基本类型的值时，整个算数表达式的数据类型将发生自动提升，而且对于btye、short、char类型都将被提升为int
        // 类型，所以此处a1 * a2的返回结果为int类型，而a3为byte类型，要想成功赋值需要进行强转
    }
}
