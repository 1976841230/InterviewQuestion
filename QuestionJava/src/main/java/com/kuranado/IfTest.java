package com.kuranado;

/**
 * Created by JING on 2017/10/28.
 */
public class IfTest {

    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        //if(x = y) { //编译报错
        if (x == y) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        System.out.println(x = y);

        boolean i = false;
        boolean j = true;
        if (i = j) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        /*
        Java中if要求的是boolean类型，而2==3返回结果为int类型的2，在Java中int类型不能自动转换为boolean类型，而C中0等价于false，1等价于true
        ，所以对于整型的x和y，if(x = y)在java中是错误的，如果x和y是boolean类型的,则if(x = y)在java中是正确的
        * */
    }

}
