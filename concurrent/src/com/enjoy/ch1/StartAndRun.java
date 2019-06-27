package com.enjoy.ch1;

import com.enjoy.tools.SleepTools;

/**
 * 类说明：start和run方法的区别
 *
 * @author luosv
 * Created on 2019/3/18 0018 16:47.
 */
public class StartAndRun {

    public static class ThreadRun extends Thread {

        @Override
        public void run() {
            int i = 90;
            while (i > 0) {
                SleepTools.ms(1000);
                System.out.println("I am " + Thread.currentThread().getName() + " and now the i=" + i--);
            }
        }
    }

    private static class User {
        public void us() {

        }
    }

    public static void main(String[] args) {
        ThreadRun beCalled = new ThreadRun();
        beCalled.setName("BeCalled");
        //beCalled.setPriority(newPriority);
        beCalled.run();

        User user = new User();
        user.us();

        //beCalled.start();
    }

}
