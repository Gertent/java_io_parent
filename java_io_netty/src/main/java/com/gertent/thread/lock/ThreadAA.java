package com.gertent.thread.lock;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/26
 */
public class ThreadAA extends Thread{
    private MyService myService;
    public ThreadAA(MyService myService){
        super();
        this.myService = myService;
    }
    @Override
    public void run(){
        myService.methodA();
    }
}
