package com.gertent.thread.lock;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/26
 */
public class ThreadB extends Thread{
    private MyService myService;
    public ThreadB(MyService myService){
        super();
        this.myService = myService;
    }
    @Override
    public void run(){
        myService.methodB();
    }
}
