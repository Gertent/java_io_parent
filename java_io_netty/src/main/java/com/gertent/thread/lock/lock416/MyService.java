package com.gertent.thread.lock.lock416;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description 使用多个Contion实现通知部分线程
 * @Author wyf
 * @Date 2017/12/26
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA(){
        try{
            lock.lock();
            System.out.println("开始awaitA时间为"+System.currentTimeMillis()+"---ThreadName"+Thread.currentThread().getName());
            conditionA.await();
            System.out.println("结束awaitA时间为"+System.currentTimeMillis()+"---ThreadName"+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void awaitB(){
        try{
            lock.lock();
            System.out.println("开始awaitB时间为"+System.currentTimeMillis()+"---ThreadName"+Thread.currentThread().getName());
            conditionB.await();
            System.out.println("结束awaitB时间为"+System.currentTimeMillis()+"---ThreadName"+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void singalAll_A(){
        try{
            lock.lock();
            System.out.println("singal_A时间为"+System.currentTimeMillis()+"---ThreadName"+Thread.currentThread().getName());
            conditionA.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public void singalAll_B(){
        try{
            lock.lock();
            System.out.println("singal_B时间为"+System.currentTimeMillis()+"---ThreadName"+Thread.currentThread().getName());
            conditionB.signalAll();
        }finally {
            lock.unlock();
        }
    }

}
