package com.kuranado.supertest;

/**
 * Created by JING on 2017/10/29.
 */
public class SuperTest {

    public static void main(String[] args) {
        new Derived("JING");
    }

}

class Base {

    public Base(String s) {
        System.out.println("B");
    }

}

class Derived extends Base {

    public Derived(String s) {
        super(s);   //不加这一行则编译失败
        System.out.println("D");
    }

}
/*java初始化顺序。初始化子类必先初始化父类。子类的构造方法会隐式去调用
  父类无参的构造方法（不会在代码中显示）。但如果父类没有无参的构造方法，就必须在子类构造方法第一行显示调用父类的有参构造方法。否则编译失败
*/