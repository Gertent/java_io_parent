package com.gertent.thread.lock.lock414;

import com.gertent.thread.lock.lock414.MyService;

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
        myService.await();
    }
}
