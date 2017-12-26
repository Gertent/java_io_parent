package com.gertent.thread.lock;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/26
 */
public class ThreadBB extends Thread{
    private MyService myService;
    public ThreadBB(MyService myService){
        super();
        this.myService = myService;
    }
    @Override
    public void run(){
        myService.methodB();
    }
}
