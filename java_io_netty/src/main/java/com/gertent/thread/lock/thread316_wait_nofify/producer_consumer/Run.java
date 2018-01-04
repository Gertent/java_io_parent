package com.gertent.thread.lock.thread316_wait_nofify.producer_consumer;

import com.gertent.thread.lock.thread316_wait_nofify.producer_consumer.ThreadC;

/**
 * @Description
 * @Author wyf
 * @Date 2018/1/3
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP threadP = new ThreadP(p);
        threadP.start();
        ThreadC threadC = new ThreadC(c);
        threadC.start();


    }
}
