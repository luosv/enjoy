package com.enjoy.ch1;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 类说明：java的多线程无处不在
 *
 * @author luosv
 * Created on 2019/3/15 0015.
 */
public class OnlyMain {

    /**
     * 程序入口
     */
    public static void main(String[] args) {

        //虚拟机线程管理的接口
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] allThreads = threadMXBean.dumpAllThreads(false, false);

        for (ThreadInfo threadInfo : allThreads) {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.getThreadName());
        }

    }

}

/*
 * [6] Monitor Ctrl-Break
 * [5] Attach Listener  获取当前程序运行的相关信息
 * [4] Signal Dispatcher  向虚拟机分发信号
 * [3] Finalizer  调用对象Finalizer方法
 * [2] Reference Handler  清除引用
 * [1] main  用户线程
 *
 * Process finished with exit code 0
 */
