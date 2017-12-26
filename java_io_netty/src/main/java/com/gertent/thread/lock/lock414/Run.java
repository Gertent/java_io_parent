package com.gertent.thread.lock.lock414;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/26
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.setName("A");
        a.start();
        Thread.sleep(3000);
        myService.singal();

        ThreadB b = new ThreadB(myService);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        myService.singal();


    }
}
