package com.gertent.thread.lock.lock4111;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/26
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    public void waitMethodEx(){
        try{
            lock.lock();
            Thread.sleep(Integer.MAX_VALUE);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void waitMethod(){
        try{
            lock.lock();
            condition.await();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void notifyMethod(){
        try{
            lock.lock();
            System.out.println("有无线程在等待newCondition?"+lock.hasWaiters(condition)+"线程数是多少？"+lock.getWaitQueueLength(condition));
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
