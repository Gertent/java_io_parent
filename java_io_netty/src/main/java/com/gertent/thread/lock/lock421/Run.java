package com.gertent.thread.lock.lock421;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/27
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
