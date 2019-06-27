package com.enjoy.ch1.safeend;

/**
 * 类说明：中断Runnable类型的线程
 *
 * @author luosv
 * Created on 2019/3/15 0015.
 */
public class EndRunnable {

    private static class UseRunnable implements Runnable {

        @Override
        public void run() {

            String threadName = Thread.currentThread().getName();
            while (Thread.currentThread().isInterrupted()) {
                System.out.println(threadName + " is run!");
            }
            System.out.println(threadName + " interrupt flag is " + Thread.currentThread().isInterrupted());
        }

    }

    public static void main(String[] args) throws InterruptedException {

        UseRunnable useRunnable = new UseRunnable();
        Thread endThread = new Thread(useRunnable, "endThread");
        endThread.start();
        Thread.sleep(20);
        endThread.interrupt();

    }

}
