package com.gertent.thread.lock.thread316_wait_nofify.producer_consumer;

/**
 * @Description
 * @Author wyf
 * @Date 2018/1/3
 */
public class ThreadP extends Thread{
    private P p;
    public ThreadP(P p){
        super();
        this.p = p;
    }
    @Override
    public void run(){
        while (true){
            p.setValue();
        }
    }
}
