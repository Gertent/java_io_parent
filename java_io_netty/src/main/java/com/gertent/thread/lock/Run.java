package com.gertent.thread.lock;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/26
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {

        /******************test*********************/
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.setName("A");
        a.start();
        ThreadAA aa = new ThreadAA(myService);
        aa.setName("AA");
        aa.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(myService);
        b.setName("B");
        b.start();
        ThreadBB bb = new ThreadBB(myService);
        bb.setName("BB");
        bb.start();




        /******************test*********************/
//        MyService myService = new MyService();
//        MyThread myThread1 = new MyThread(myService);
//        MyThread myThread2 = new MyThread(myService);
//        MyThread myThread3 = new MyThread(myService);
//        MyThread myThread4 = new MyThread(myService);
//        MyThread myThread5 = new MyThread(myService);
//        myThread1.start();
//        myThread2.start();
//        myThread3.start();
//        myThread4.start();
//        myThread5.start();
    }
}
