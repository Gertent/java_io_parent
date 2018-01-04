package com.gertent.thread.lock.thread1300;

/**
 * @Description
 * @Author wyf
 * @Date 2018/1/2
 */
public class Run2 {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();

        CountOperate c = new CountOperate();
        Thread t = new Thread(c);
        t.setName("A");
        t.start();
    }
}
