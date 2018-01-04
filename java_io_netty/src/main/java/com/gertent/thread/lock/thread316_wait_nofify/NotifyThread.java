package com.gertent.thread.lock.thread316_wait_nofify;

/**
 * @Description
 * @Author wyf
 * @Date 2018/1/3
 */
public class NotifyThread extends Thread {
    private Object lock;
    public NotifyThread(Object lock){
        super();
        this.lock = lock;
    }
    @Override
    public void run(){
        synchronized (lock){
            lock.notifyAll();
//            lock.notify();
        }
    }
}
