package com.enjoy.tools;

import java.util.concurrent.TimeUnit;

/**
 * 类说明：线程休眠辅助工具类
 *
 * @author luosv
 * Created on 2019/3/18 0018 16:41.
 */
public class SleepTools {

    /**
     * 按秒休眠
     *
     * @param seconds 秒数
     */
    public static final void second(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }

    /**
     * 按毫秒数休眠
     *
     * @param seconds 毫秒数
     */
    public static final void ms(int seconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }

}
