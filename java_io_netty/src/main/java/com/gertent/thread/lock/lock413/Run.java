package com.gertent.thread.lock.lock413;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/26
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();

        ThreadAA aa = new ThreadAA(myService);
        aa.start();


//        ThreadA a = new ThreadA(myService);
//        a.start();
    }
}
