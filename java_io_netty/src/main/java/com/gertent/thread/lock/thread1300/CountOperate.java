package com.gertent.thread.lock.thread1300;

/**
 * @Description
 * @Author wyf
 * @Date 2018/1/2
 */
public class CountOperate extends Thread {
    public CountOperate(){
        System.out.println("构造方法------begin");
        System.out.println("Thread.currentThread().getName()--" + Thread.currentThread().getName());
        System.out.println("this.getName()" + this.getName());
        System.out.println("构造方法------end");
    }

    @Override
    public void run(){
        System.out.println("run方法----begin");
        System.out.println("Thread.currentThread().getName()--" + Thread.currentThread().getName());
        System.out.println("this.getName()" + this.getName());
        System.out.println("run方法----end");
    }
}
