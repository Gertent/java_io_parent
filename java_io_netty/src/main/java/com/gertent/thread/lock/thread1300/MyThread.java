package com.gertent.thread.lock.thread1300;

/**
 * @Description currentThread用法
 * @Author wyf
 * @Date 2018/1/2
 */
public class MyThread extends Thread {

    public MyThread(){
        System.out.println("构造方法打印："+ Thread.currentThread().getName());
        System.out.println("构造方法打印this："+ this.getName());
    }

    @Override
    public void run(){
        System.out.println("run方法打印：" + Thread.currentThread().getName());
        System.out.println("run方法打印this：" + this.getName());
    }
}
