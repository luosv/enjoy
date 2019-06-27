package com.enjoy.ch1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 类说明：如何新建线程
 *
 * @author luosv
 * Created on 2019/3/15 0015.
 */
public class NewThread {

    //扩展自Thread类

    //实现Runnable接口
    private static class UseRun implements Runnable {

        @Override
        public void run() {
            System.out.println("I am implements Runnable");
        }

    }

    //实现Callable接口，允许有返回值
    private static class UseCall implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println("I am implements Callable");
            return "CallResult";
        }

    }

    /**
     * 程序入口
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        UseRun useRun = new UseRun();
        new Thread(useRun).start();

        //线程停止
        Thread t = new Thread(useRun);
        t.interrupt();

        UseCall useCall = new UseCall();
        FutureTask<String> futureTask = new FutureTask<>(useCall);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }

}
