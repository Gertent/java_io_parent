package com.gertent.thread.lock.lock421;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/27
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
//        service.read();
        service.write();
    }
}
