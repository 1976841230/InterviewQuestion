package com.kuranado;

/**
 * Created by JING on 2017/10/28.
 */
public class PolymorphicTest {

    public static void main(String[] args) {
        /*
         Base base=new Son(); 是多态的表示形式。父类对象调用了子类创建了Son对象。
         base调用的method()方法就是调用了子类重写的method()方法。
         而此时base还是属于Base对象，base调用methodB()时Base对象里没有这个方法，所以编译不通过。
         要想调用的话需要先通过SON son=(SON)base;强制转换，然后用son.methodB()调用就可以了。

        当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；
        如果有，再去调用子类的同名方法。
        静态方法特殊，静态方法只能继承，不能覆盖，如果子类有和父类相同的静态方法，只是起到隐藏父类方法的作用。这时候，谁的引用就调用谁的方法。
         */
        Base base = new Son();
        base.method();
        //base.method2(); //编译出错
        Son son = (Son) base;
        son.methodB();
    }

}

class Base {

    public void method() {
        System.out.println("Base");
    }

}

class Son extends Base {

    @Override
    public void method() {
        System.out.println("Son");
    }

    public void methodB() {
        System.out.println("Son2");
    }

}