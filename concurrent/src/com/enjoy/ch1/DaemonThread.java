package com.enjoy.ch1;

import java.util.concurrent.ExecutionException;

/**
 * 类说明：守护线程的使用和守护线程中的finally语句块
 *
 * @author luosv
 * Created on 2019/3/18 0018 16:41.
 */
public class DaemonThread {

    private static class UseThread extends Thread {

        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + " I am extends Thread.");
                }
                System.out.println(Thread.currentThread().getName() + " interrupt flag is " + isInterrupted());
            } finally {
                System.out.println("...........finally");
            }
        }

    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        UseThread useThread = new UseThread();
        useThread.setDaemon(true);
        useThread.start();
        Thread.sleep(5);
        //useThread.interrupt();

    }

}
