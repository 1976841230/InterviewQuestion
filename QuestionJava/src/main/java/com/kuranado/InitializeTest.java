package com.kuranado;

/**
 * Created by JING on 2017/10/28.
 */
public class InitializeTest {
    public static void main(String[] args) {
        new Z();
    }
}
class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
class Z extends X{
    Y y=new Y();
    public Z(){
        System.out.print("Z");
    }
}
//8->12->18->13->23->18->24
/*
初始化过程：
1. 初始化父类中的静态成员变量和静态代码块(注意静态代码块只会被执行一次)
2. 初始化子类中的静态成员变量和静态代码块(注意静态代码块只会被执行一次)
3.初始化父类的普通成员变量和代码块，再执行父类的构造方法
4.初始化子类的普通成员变量和代码块，再执行子类的构造方法
* */