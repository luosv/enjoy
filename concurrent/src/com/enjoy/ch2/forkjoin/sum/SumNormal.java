package com.enjoy.ch2.forkjoin.sum;

/**
 * @author luosv
 * Created on 2019/3/19 0019 17:14.
 */
public class SumNormal {

    public static void main(String[] args) {
        int count = 0;
        int[] src = MakeArray.makeArray();

        long start = System.currentTimeMillis();
        for (int i = 0; i < src.length; i++) {
            //SleepTools.ms(1);
            count = count + src[i];
        }
        System.out.println("The count is " + count
                + " spend time:" + (System.currentTimeMillis() - start) + "ms");
    }

}
