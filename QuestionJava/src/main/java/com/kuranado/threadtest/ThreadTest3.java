package com.kuranado.threadtest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by JING on 2017/10/29.
 */
public class ThreadTest3 {

    public static void main(String[] args) {
        Callable<Integer> callable = new MyThread3();
        //使用FutureTask对象包装Callable对象
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
        //FutureTask对象作为Thread对象的target创建新的线程
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            System.out.println(futureTask.get());   //取得新创建线程中call方法返回的结果
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}

class MyThread3 implements Callable<Integer> {
    /**
     * 与实现Runnable接口的run方法不同，Callable接口的call方法有返回值
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 5; i ++) {
            sum += i;
        }
        return sum;
    }
}
