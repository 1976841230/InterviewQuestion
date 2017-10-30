package com.kuranado.threadtest;

import java.util.PrimitiveIterator;

/**
 * Created by JING on 2017/10/29.
 */
public class ThreadTest2 {

    public static void main(String[] args) {
        new Thread(new MyThread2()).start();
        new Thread(new MyThread2()).start();
    }

}

class MyThread2 implements Runnable {
    private boolean stop;
    @Override
    public void run() {
        for (int i = 0; i < 5 && !stop; i ++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public void stopThread() {
        stop = true;
    }
}
