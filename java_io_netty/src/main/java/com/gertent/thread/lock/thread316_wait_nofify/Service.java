package com.gertent.thread.lock.thread316_wait_nofify;

/**
 * @Description
 * @Author wyf
 * @Date 2018/1/3
 */
public class Service {
    public void testMethod(Object lock){
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait() ThreadName=" + Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
