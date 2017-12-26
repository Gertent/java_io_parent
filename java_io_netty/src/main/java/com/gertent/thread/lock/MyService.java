package com.gertent.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/26
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i = 0;i < 5; i++){
            System.out.println("ThreadName:"+Thread.currentThread().getName()+ "(" +(i+1)+")");
        }
        lock.unlock();
    }

    public void methodA(){
        try{
            lock.lock();
            System.out.println("methodA begin ThreadName = " + Thread.currentThread().getName() + "time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA end ThreadName = " + Thread.currentThread().getName() + "time = " + System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void methodB(){
        try{
            lock.lock();
            System.out.println("methodB begin ThreadName = " + Thread.currentThread().getName() + "time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB end ThreadName = " + Thread.currentThread().getName() + "time = " + System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
