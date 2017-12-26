package com.gertent.thread.lock.lock416;

import com.gertent.thread.lock.lock416.MyService;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/26
 */
public class ThreadA extends Thread {
    private MyService myService;
    public ThreadA(MyService myService){
        super();
        this.myService = myService;
    }
    @Override
    public void run(){
        myService.awaitA();
    }
}
