package com.gertent.thread.lock.thread316_wait_nofify;

/**
 * @Description
 * @Author wyf
 * @Date 2018/1/3
 */
public class ThreadC extends Thread {
    private Object lock;
    public ThreadC(Object lock){
        super();
        this.lock = lock;
    }
    @Override
    public void run(){
        Service service = new Service();
        service.testMethod(lock);
    }
}
