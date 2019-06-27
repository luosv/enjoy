package com.enjoy.ch1.safeend;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类说明：抛出InterruptedException异常的时候，要注意中断标志位
 *
 * @author luosv
 * Created on 2019/3/15 0015.
 */
public class HasInterruptException {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss_SSS");

    private static class UseThread extends Thread {

        public UseThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            while (!isInterrupted()) {
                try {
                    System.out.println("UseThread:" + format.format(new Date()));
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println(threadName + " catch interrupt flag is " + isInterrupted()
                            + " at " + (format.format(new Date())));
                    interrupt();
                    e.printStackTrace();
                }
                System.out.println(threadName);
            }
            System.out.println(threadName + " interrupt flag is " + isInterrupted());
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Thread endThread = new UseThread("HasInterruptEx");
        endThread.start();
        System.out.println("Main:" + format.format(new Date()));
        Thread.sleep(800);
        System.out.println("Main begin interrupt thread:" + format.format(new Date()));
        endThread.interrupt();

    }

}
