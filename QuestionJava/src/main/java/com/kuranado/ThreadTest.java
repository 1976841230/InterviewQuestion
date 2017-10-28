package com.kuranado;

/**
 * Created by JING on 2017/10/28.
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Math.random());
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        a.start();
        b.start();
    }
}

class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i ++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep((long) (Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}