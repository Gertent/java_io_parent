package com.gertent.thread.lock.thread316_wait_nofify.producer_consumer;

/**
 * @Description
 * @Author wyf
 * @Date 2018/1/3
 */
public class ThreadC extends Thread{
    private C c;
    public ThreadC(C c){
        super();
        this.c = c;
    }
    @Override
    public void run(){
        while (true){
            c.getValue();
        }
    }
}
